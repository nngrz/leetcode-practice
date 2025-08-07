// Solution1: Brute Force
// var twoSum = function(nums, target) {
//     for (let i = 0; i < nums.length; i++) {
//         for (let j = i + 1; j < nums.length; j++) {
//             if (nums[i] + nums[j] == target) {
//                 return [i, j]
//             }
//         }
//     }

//     return [];
// };

// Solution2: Two-pass Hash Table
var twoSum = function(nums, target) {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
        map.set(nums[i], i);
    }

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        if (map.has(complement) && map.get(complement) !== i) {
            return [i, map.get(complement)];
        }
    }

    // If no valid pair is found, return empty array
    return [];
};

// Test 1
const nums1 = [2,7,11,15];
const target1 = 9;
console.log(twoSum(nums1, target1));

// Test 2
const nums2 = [3,3];
const target2 = 6;
console.log(twoSum(nums2, target2));

// Test 3
const nums3 = [3,2,4];
const target3 = 0;
console.log(twoSum(nums3, target3));
