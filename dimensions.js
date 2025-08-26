var areaOfMaxDiagonal = function(dimensions) {

    let max_area = 0;
    let longest_diagonal = 0;

    for (let i = 0; i < dimensions.length; i++) {
        let length = dimensions[i][0];
        let width = dimensions[i][1];
        console.log("length = " + length);
        console.log("width = " + width);
        let current_longest_diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        let current_max_area = length * width;
        console.log("current_longest_diagonal is: " + current_longest_diagonal);
        if (current_longest_diagonal > longest_diagonal) {
            longest_diagonal = current_longest_diagonal;
            max_area = current_max_area;
        } else if (current_longest_diagonal === longest_diagonal) {
            if (current_max_area > max_area) {
                max_area = current_max_area;
            }
        }
        console.log("longest_diagonal is: " + longest_diagonal);
        console.log("max_area is: " + max_area);
    }

    return max_area;
};

// console.log(areaOfMaxDiagonal([[9,3],[8,6]]));
console.log(areaOfMaxDiagonal([[3,4],[4,3]]));
