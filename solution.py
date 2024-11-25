Here is a Python console application that checks if a given matrix is a magic square or not.

```python
def is_magic_square(matrix):
    # Calculate the sum of the first row
    sum_row = sum(matrix[0])

    # Check the sums of all other rows
    for row in matrix:
        if sum(row) != sum_row:
            return False

    # Check the sums of all columns
    for col in range(len(matrix[0])):
        if sum(row[col] for row in matrix) != sum_row:
            return False

    # Check the sum of the main diagonal
    if sum(matrix[i][i] for i in range(len(matrix))) != sum_row:
        return False

    # Check the sum of the other diagonal
    if sum(matrix[i][len(matrix)-i-1] for i in range(len(matrix))) != sum_row:
        return False

    return True

def main():
    matrix = []
    n = int(input("Enter the size of the square matrix: "))
    for i in range(n):
        row = list(map(int, input("Enter row {} of the matrix: ".format(i+1)).split()))
        matrix.append(row)

    if is_magic_square(matrix):
        print("The matrix is a magic square.")
    else:
        print("The matrix is not a magic square.")

if __name__ == "__main__":
    main()
```

This program first asks the user to input the size of the square matrix. Then, it asks the user to input each row of the matrix. After that, it checks if the matrix is a magic square or not and prints the result.