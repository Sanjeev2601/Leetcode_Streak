class Solution:
    def search(self, nums: List[int], target: int) -> int:
        beg, mid, end = 0, len(nums)//2, len(nums)-1
        
        while beg <= end:
            if nums[mid] < target:
                beg = mid+1
            elif nums[mid] > target:
                end = mid - 1
            elif nums[mid] == target:
                return mid
            mid = (beg + end) // 2
        return -1
    