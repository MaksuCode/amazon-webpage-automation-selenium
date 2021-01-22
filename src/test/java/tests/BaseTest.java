import org.junit.FixMethodOrder;
//import org.junit.jupiter.api.DisplayNameGeneration;
//import org.junit.jupiter.api.DisplayNameGenerator;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseTest {
}
