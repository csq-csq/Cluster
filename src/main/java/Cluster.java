import weka.clusterers.ClusterEvaluation;
import weka.clusterers.EM;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class Cluster {
    public void run(int number,String filename) throws Exception {
        Instances data=new DataSource(filename).getDataSet();

        EM em=new EM();
        em.setNumClusters(number);
        em.buildClusterer(data);
        em.setDebug(true);

        ClusterEvaluation clusterEvaluation=new ClusterEvaluation();
        clusterEvaluation.setClusterer(em);
        clusterEvaluation.evaluateClusterer(data);

        System.out.println(clusterEvaluation.clusterResultsToString());
        double[] n=clusterEvaluation.getClusterAssignments();
        for(int i=0;i<n.length;i++){
            System.out.println("number:"+i+"  "+"result:"+em.clusterInstance(data.instance(i)));
        }
    }
}
