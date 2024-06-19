
https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumCount = function(nums) {
    var pos =0;
    var neg = 0;
    for(var i =0;i<nums.length;i++){
        if(nums[i]>0){
            pos++;
        }
        else if(nums[i]<0){
            neg++;
        }
        else{
            continue;
        }
    }

    return Math.max(pos,neg);
};
