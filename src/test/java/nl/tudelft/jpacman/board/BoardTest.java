package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoardTest {
    private Board board;
    @BeforeEach
    void setBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }
    @Test
    void testNull(){
        assertThat(board).isNotNull();
    }
    @Test
    void testWidthHeight(){
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
    }
    @Test
    void testInvariant(){
        assertThat(board.invariant()).isTrue();
    }
    @Test
    void testWithinBorders(){
        assertThat(board.withinBorders(0,0)).isTrue();
    }
    @Test
    void testSquareAt(){
        Square[][] grid = new Square[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0,0)).isNull();
    }

}
