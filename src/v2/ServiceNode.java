package v2;

import java.io.File;
import java.util.ArrayList;

import javax.swing.tree.DefaultTreeModel;

public interface ServiceNode {
    public ServiceNode tree(String path);

    public ServiceNode tree(String path, int depth);

    public ArrayList<File> doublons();

    public DefaultTreeModel treeModel();

    public String filename();

    public String hash();

    public long weight();

    public String absolutePath();

    public ArrayList<ServiceNode> child();

    public ServiceNode filter(String[] filtres);

    public ServiceNode createINode(File f);
}