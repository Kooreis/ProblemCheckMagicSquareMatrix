def is_magic_square(matrix):
    # Calculate the sum of the first row
    sum_row = sum(matrix[0])

    # Check the sums of all other rows
    for row in matrix:
        if sum(row) != sum_row:
            return False