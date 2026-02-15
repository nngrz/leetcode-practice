function absluteValue(a, b) {
    let value = b - a;
    if (value < 0) {
        return -value;
    }
    return value
}

var findClosest = function(x, y, z) {
    let distanceXZ = absluteValue(x, z);
    let distanceYZ = absluteValue(y, z);

    if (distanceXZ < distanceYZ) {
        return 1;
    } else if (distanceXZ > distanceYZ) {
        return 2;
    }

    return 0;
};

console.log(findClosest(2, 7, 4));
console.log(findClosest(1, 5, 3));
