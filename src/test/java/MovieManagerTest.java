import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void addMovies() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Test 1");
        manager.addMovie("Test 2");
        manager.addMovie("Test 3");
        manager.addMovie("Test 4");

        String[] actual = manager.findAll();
        String[] expected = {"Test 1", "Test 2", "Test 3", "Test 4"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Test 1");
        manager.addMovie("Test 2");
        manager.addMovie("Test 3");
        manager.addMovie("Test 4");

        String[] actual = manager.findLast(5);
        String[] expected = {"Test 4", "Test 3", "Test 2", "Test 1"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addLastMovieIfMoviesQtyThatEqualsLimit() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Test 1");
        manager.addMovie("Test 2");
        manager.addMovie("Test 3");
        manager.addMovie("Test 4");
        manager.addMovie("Test 5");
        manager.addMovie("Test 6");
        manager.addMovie("Test 7");
        manager.addMovie("Test 8");
        manager.addMovie("Test 9");
        manager.addMovie("Test 10");


        String[] actual = manager.findLast(10);
        String[] expected = {"Test 10", "Test 9", "Test 8", "Test 7", "Test 6", "Test 5", "Test 4", "Test 3", "Test 2", "Test 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesIfMoviesQtyThatEqualsLimit() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Test 1");
        manager.addMovie("Test 2");
        manager.addMovie("Test 3");
        manager.addMovie("Test 4");
        manager.addMovie("Test 5");
        manager.addMovie("Test 6");
        manager.addMovie("Test 7");
        manager.addMovie("Test 8");
        manager.addMovie("Test 9");
        manager.addMovie("Test 10");


        String[] actual = manager.findAll();
        String[] expected = {"Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Test 6", "Test 7", "Test 8", "Test 9", "Test 10"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addLastMovieIfMoviesMoreThanLimit() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("Test 1");
        manager.addMovie("Test 2");
        manager.addMovie("Test 3");
        manager.addMovie("Test 4");
        manager.addMovie("Test 5");
        manager.addMovie("Test 6");
        manager.addMovie("Test 7");
        manager.addMovie("Test 8");
        manager.addMovie("Test 9");
        manager.addMovie("Test 10");
        manager.addMovie("Test 11");


        String[] actual = manager.findLast(10);
        String[] expected = {"Test 11", "Test 10", "Test 9", "Test 8", "Test 7", "Test 6", "Test 5", "Test 4", "Test 3", "Test 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

}
