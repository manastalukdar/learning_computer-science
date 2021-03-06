class Solution:
    def find_strings(self, x):
        nums = []
        prev = ""
        total = 0
        for i in str(x):
            if int(i) != 0:
                total += 1
                nums.append(int(i))
            if prev and int(prev + i) != int(i) and int(prev + i) < 27:
                total += 1
                nums.append(int(prev + i))
            prev = i
        return total, nums


def main():
    solution = Solution()
    print(solution.find_strings(23413259802))


if __name__ == '__main__':
    main()
