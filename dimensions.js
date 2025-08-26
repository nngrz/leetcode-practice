var areaOfMaxDiagonal = function(dimensions) {

    let max_area = 0;
    let longest_diagonal = 0;

    for (let i = 0; i < dimensions.length; i++) {
        let current_longest_diagonal = Math.sqrt(Math.pow(dimensions[i][0]) + Math.pow(dimensions[i][1]));
        let length = dimensions[i][0];
        let width = dimensions[i][1];
        let current_max_area = length * width;
        if ( current_longest_diagonal >= longest_diagonal) {
            longest_diagonal = current_longest_diagonal;
            current_max_area = length * width;
        } else {
            if (current_max_area > max_area) {
                max_area = current_max_area;
            }
        }
    }

    return max_area;
};

console.log(areaOfMaxDiagonal([[9,3],[8,6]]));
console.log(areaOfMaxDiagonal([[3,4],[4,3]]));
