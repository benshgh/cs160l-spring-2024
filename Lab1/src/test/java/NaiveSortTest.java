
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NaiveSortTest {

	String[] promotionOrder = null;
	
	@InjectMocks
    NaiveSort nSort;

    @Mock
    NaiveSort.sortingSolution sortSol;
	
	void assertResults(String[] expected, String[] actual) {
		assertTrue(expected.length == actual.length);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i].equalsIgnoreCase(actual[i]));
		}
	}

    @BeforeClass
    public static void beforeClass() {
        // This method will be executed once on initialization time
    }
    
	@Before
	public void before() {
		// This method will be executed once before each test execution
		promotionOrder = new String[] { "mz", "mx", "my" };
    }

    @AfterClass
    public static void afterClass() {
        // This method will be executed once when all tests are executed
    }

    @After
    public void after() {
        // This method will be executed once after each test execution
    }
    
	@Test
	public void carInvMoreThan3Cars() {
		String[] carInventory = new String[] { "mz", "my", "my", "mx", "mz", "mx", "my", "mz" };

		//Student TODO: 
        //Add mocking connection here to make the following assertThat testing work.

        assertThat(nSort.sortCarInventory(carInventory, promotionOrder))
                .hasSize(8)
                .containsExactly(nSort.getSortedResFromSolution(carInventory, promotionOrder));
	}

	@Test
	public void carInv2ModelsOfCars() {
		//Student TODO: 
		//Change the following code to use the SAME mocking approach as in 
		//carInvMoreThan3Cars above for testing
		String[] carInventory = new String[] { "my", "my", "mx", "mx", "my" };
		String[] expectedRes = new String[] { "mx", "mx", "my", "my", "my" };
		String[] actualRes = (new NaiveSort()).sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);		
	}
	
	@Test
	public void carInv2Cars() {
		//Student TODO: 
		//Change the following code to use the SAME mocking approach as in 
		//carInvMoreThan3Cars above for testing
		String[] carInventory = new String[] { "mx", "mz" };
		String[] expectedRes = new String[] { "mz", "mx" };
		String[] actualRes = (new NaiveSort()).sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);
	}

	@Test
	public void carInv1Car() {
		//Student TODO: 
		//Change the following code to use the SAME mocking approach as in 
		//carInvMoreThan3Cars above for testing
		String[] carInventory = new String[] { "mx" };
		String[] expectedRes = new String[] { "mx" };
		String[] actualRes = (new NaiveSort()).sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);
	}
}