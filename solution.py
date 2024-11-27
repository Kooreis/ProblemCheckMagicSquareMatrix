    # Check the sums of all columns
    for col in range(len(matrix[0])):
        if sum(row[col] for row in matrix) != sum_row:
            return False