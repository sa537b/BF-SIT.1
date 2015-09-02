package github.samplegithub;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.kohsuke.github.GHBranch;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Collection<GHRepository> lst;
    	Map<String,GHBranch> ghBranch;
    	try {
			GitHub github = GitHub.connectToEnterprise("https://github.com/att-innovate/BF-SIT.1.git", "sa537b", "samy@june2015");
			GHRepository repo = github.getRepository("");
			ghBranch = repo.getBranches();
			System.out.println(ghBranch);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
	/*	try {   // sample file edited
			lst = GitHub.connectAnonymously().getUser("sa537b").getRepositories().values();
			for (GHRepository r : lst) {
				System.out.println(r.getBranches());
	            System.out.println(r.getName());
	        }
	        System.out.println(lst.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        
		/*File gitWorkDir = new File("https://github.com/att-innovate/");
	    Git git;
		try {
			git = Git.open(gitWorkDir);
			Repository repo = git.getRepository();
			 
		    ObjectId lastCommitId = repo.resolve(Constants.HEAD);
		 
		    RevWalk revWalk = new RevWalk(repo);
		    RevCommit commit = revWalk.parseCommit(lastCommitId);
		 
		    RevTree tree = commit.getTree();
		 
		    TreeWalk treeWalk = new TreeWalk(repo);
		    treeWalk.addTree(tree);
		    treeWalk.setRecursive(true);
		    treeWalk.setFilter(PathFilter.create("file1.txt"));
		    if (!treeWalk.next()) 
		    {
		      System.out.println("Nothing found!");
		      return;
		    }
		 
		    ObjectId objectId = treeWalk.getObjectId(0);
		    ObjectLoader loader = repo.open(objectId);
		    ByteArrayOutputStream out = new ByteArrayOutputStream();
		    loader.copyTo(out);
		    System.out.println("file1.txt:\n" + out.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	/*Git result = null;
    	 try {
    	String REMOTE_URL = "https://github.com/att-innovate/BF-SIT.1.git";
    	File localPath = File.createTempFile("TestGitRepository", "");
        localPath.delete();

        // then clone
        System.out.println("Cloning from " + REMOTE_URL + " to " + localPath);
         result = Git.cloneRepository()
                .setURI(REMOTE_URL)
                .setDirectory(localPath)
                .call();
	        // Note: the call() returns an opened repository already which needs to be closed to avoid file handle leaks!
	        System.out.println("Having repository: " + result.getRepository().getDirectory());
        } catch(Exception e){
        	e.printStackTrace();
        }finally {
        	result.close();
        }
	   
	    */
    }
}
