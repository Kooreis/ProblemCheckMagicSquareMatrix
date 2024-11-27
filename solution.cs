class Program
{
    static void Main(string[] args)
    {
        int[,] matrix = new int[,] { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
        Console.WriteLine(IsMagicSquare(matrix));
    }