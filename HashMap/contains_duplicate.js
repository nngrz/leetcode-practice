var containsDuplicate = function(nums) {
    const numsMap = new Map();

    for (let i = 0; i < nums.length; i++) {
        if (numsMap.has(nums[i])) {
            return false;
        } else {
            numsMap.set(nums[i], i);
        }
    }
    return true;
}

console.log(containsDuplicate([1,2,3,1]));
console.log(containsDuplicate([1,2,3,4]));
console.log(containsDuplicate([1,1,1,3,3,4,3,2,4,2]));