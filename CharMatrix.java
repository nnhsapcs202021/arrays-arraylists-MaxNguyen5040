// Implements a 2-D array of characters

public class CharMatrix
{
    // Instance variables:
    private int rows;
    private int cols;
    private char fill;
    private char[][] array;

    // Constructor: creates a grid with dimensions rows, cols,
    // and fills it with spaces
    public CharMatrix(int initialRows, int initialCols)
    {
        this.rows = initialRows;
        this.cols = initialCols;
        this.fill = ' ';
        this.array = new char[initialRows][initialCols];
        for(int i = 0; i < initialRows; i++)
        {
            for(int j = 0; j < initialCols; j++)
            {
                this.array[i][j] = ' ';
            }
        }
    }

    // Constructor: creates a grid with dimensions rows , cols ,
    // and fills it with the fill character
    public CharMatrix(int initialRows, int initialCols, char initialFill)
    {
        this.rows = initialRows;
        this.cols = initialCols;
        this.fill = initialFill;
        this.array = new char[initialRows][initialCols];
        for(int i = 0; i < initialRows; i++)
        {
            for(int j = 0; j < initialCols; j++)
            {
                this.array[i][j] = initialFill;
            }
        }
    }

    // Returns the number of rows in grid
    public int numRows()
    {
        return this.rows;
    }

    // Returns the number of columns in grid
    public int numCols()
    {
        return this.cols;
    }

    // Returns the character at row, col location
    public char charAt(int row, int col)
    {
        return this.array[row][col];
    }

    // Sets the character at row, col location to ch
    public void setCharAt(int row, int col, char ch)
    {
        this.array[row][col] = ch;
    }

    // Returns true if the character at row, col is a space,
    // false otherwise
    public boolean isEmpty(int row, int col)
    {
        return this.array[row][col] == ' ';
    }

    // Fills the given rectangle with fill characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void fillRect(int row0, int col0, int row1, int col1, char fill)
    {
        for(int i = row0; i <= row1; i++)
        {
            for(int j = col0; j <= col1; j++)
            {
                this.array[i][j] = fill;
            }
        }
    }

    // Fills the given rectangle with SPACE characters.
    // row0, col0 is the upper left corner and row1, col1 is the
    // lower right corner of the rectangle.
    public void clearRect(int row0, int col0, int row1, int col1)
    {
        for(int i = row0; i <= row1; i++)
        {
            for(int j = col0; j <= col1; j++)
            {
                this.array[i][j] = ' ';
            }
        }
    }

    // Returns the count of all non-space characters in row
    public int countInRow(int row)
    {
        int count = 0;

        for(int i = 0; i < this.array[row].length; i++)
        {
            if(this.array[row][i] != ' ')
            {
                count += 1;
            }
        }
        return count;
    }

    // Returns the count of all non-space characters in col
    public int countInCol(int col)
    {
        int count = 0;

        for(int i = 0; i < cols; i++)
        {
            if(this.array[i][col] != ' ')
            {
                count += 1;
            }
        }
        return count;
    }
}