import org.junit.Test;

public class ClusterTest {
    @Test
    public void bankTest() throws Exception {
        new Cluster().run(6,"src/main/resources/bank_data.arff");
    }
    @Test
    public void bmwTest() throws Exception{
        new Cluster().run(5,"src/main/resources/bmw-browsers.arff");
    }
    @Test
    public void irisTest() throws Exception{
        new Cluster().run(3,"src/main/resources/iris.arff");
    }
}
