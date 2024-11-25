```C#
using System;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        int[,] matrix = new int[,] { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        Console.WriteLine(IsMagicSquare(matrix));
    }

    static bool IsMagicSquare(int[,] matrix)
    {
        int n = matrix.GetLength(0);
        int magicSum = Enumerable.Range(0, n).Sum(i => matrix[0, i]);

        for (int i = 1; i < n; i++)
        {
            if (Enumerable.Range(0, n).Sum(j => matrix[i, j]) != magicSum)
                return false;
        }

        for (int i = 0; i < n; i++)
        {
            if (Enumerable.Range(0, n).Sum(j => matrix[j, i]) != magicSum)
                return false;
        }

        if (Enumerable.Range(0, n).Sum(i => matrix[i, i]) != magicSum)
            return false;

        if (Enumerable.Range(0, n).Sum(i => matrix[i, n - i - 1]) != magicSum)
            return false;

        return true;
    }
}
```