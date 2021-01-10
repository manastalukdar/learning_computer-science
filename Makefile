workspaceFolder :=
gradlewScript :=

# https://gist.github.com/sighingnow/deee806603ec9274fd47
ifneq ($(OS),Windows_NT)
	workspaceFolder = ./
	gradlewScript = gradlew
else
	gradlewScript = .\gradlew.bat
endif

#*****************
# Java code tasks
#*****************

javadependencies:
	${workspaceFolder}${gradlewScript} dependencies

javabuild:
	${workspaceFolder}${gradlewScript} build

javatest:
	${workspaceFolder}${gradlewScript} test

javaclean:
	${workspaceFolder}${gradlewScript} clean

javatestcoverage:
	${workspaceFolder}${gradlewScript} test jacocoJupTestReport

javacode: javadependencies javaclean javatestcoverage

#*****************
# C# code tasks
#*****************

xunittests:
	python ${workspaceFolder}scripts/run_xunit_tests.py

csharpcode: xunittests

#*******************
# Python code tasks
#*******************

pythonrequirements:
	pip install -r requirements.txt

pythontests:
	python ${workspaceFolder}scripts/run_unit_tests.py

pythontestcoverage:
	coverage run ${workspaceFolder}scripts/run_unit_tests.py

pythoncode: pythontestcoverage

#*****************
# Project tasks
#*****************

getproblemscount:
	python ${workspaceFolder}scripts/get_problems_count.py

#*****************
# Git tasks
#*****************

git-version:
	git --version

git-submodules-setup:
	git submodule sync --recursive
	git submodule foreach --recursive git fetch
	git submodule foreach git pull origin main

get-git-submodules:
	git submodule update --init --recursive --remote --merge

#*****************
# All tasks
#*****************

git: git-version git-submodules-pull get-git-submodules

code: javacode pythoncode csharpcode

all: git getproblemscount code

