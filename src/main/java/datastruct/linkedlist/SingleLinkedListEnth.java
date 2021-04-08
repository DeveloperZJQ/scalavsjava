package datastruct.linkedlist;

/**
 * @author happy
 * @since 2021-03-18
 */
public class SingleLinkedListEnth {
    private NodeModel nodeFirst = new NodeModel("zero", "student", "9");

    public static void main(String[] args) {

        NodeModel nodeModel1 = new NodeModel("one", "student", "1");
        NodeModel nodeModel2 = new NodeModel("two", "student", "10");
        NodeModel nodeModel3 = new NodeModel("three", "student", "0");
        NodeModel nodeModel4 = new NodeModel("four", "student", "4");
        NodeModel nodeModel5 = new NodeModel("five", "student", "6");

        SingleLinkedListEnth nodeList = new SingleLinkedListEnth();
        SingleLinkedListEnth nodeParams = new SingleLinkedListEnth();
/*
        nodeList.add(nodeModel1);
        nodeList.add(nodeModel2);
        nodeList.add(nodeModel3);
        nodeList.add(nodeModel4);
        nodeList.add(nodeModel5);
        nodeList.display();
        System.out.println("------------------------单节点新增分割线——---------------------");

        nodeParams.add(nodeModel1, nodeModel2, nodeModel3, nodeModel4, nodeModel5);
        nodeParams.display();
        System.out.println("------------------------多节点新增分割线——---------------------");

        nodeList.del("four");
        nodeList.display();
        System.out.println("------------------------单节点删除分割线——---------------------");
*/
        nodeList.addSort(nodeModel1);
//        nodeList.addSort(nodeModel2);
//        nodeList.addSort(nodeModel3);
//        nodeList.addSort(nodeModel4);
//        nodeList.addSort(nodeModel5);
        nodeList.display();
        System.out.println("------------------------按顺序插入删除分割线——---------------------");
    }

    /**
     * 链表display
     */
    public void display() {
        if (nodeFirst != null) {
            NodeModel temp = nodeFirst;
            while (true) {
                System.out.println(temp);
                temp = temp.getNode();
                if (temp == null) {
                    break;
                }
            }
        }
    }

    /**
     * 添加单个node
     */
    public void add(NodeModel node) {
        if (node != null) {
            NodeModel temp = nodeFirst;
            while (true) {
                if (temp.getNode() == null) break;
                temp = temp.getNode();
            }
            temp.setNode(node);
        }
    }

    /**
     * 添加多个Node
     */
    public void add(NodeModel... node) {
        if (node.length > 0) {
            NodeModel temp = nodeFirst;
            while (true) {
                if (temp.getNode() == null) break;
                temp = temp.getNode();
            }
            for (NodeModel nodeModel : node) {
                temp.setNode(nodeModel);
                temp = temp.getNode();
            }
        }
    }


    public void addSort(NodeModel node) {
        Boolean first = false;
        if (node != null) {
            NodeModel temp = nodeFirst;
            while (true) {
                if (temp.getNode()==null){
                    if (Long.parseLong(temp.getQ())>Long.parseLong(node.getQ())){
                        node.setNode(temp);
                        System.out.println("this is first insert node.");
                        break;
                    }else {
                        temp.setNode(node);
                    }
                }
                if (Long.parseLong(temp.getQ()) > Long.parseLong(node.getQ()) && Long.parseLong(node.getQ()) > Long.parseLong(temp.getNode().getQ())) {

                }
            }
            if (first){
                temp.setNode(node);
            }
        }
    }

    public void addSort(NodeModel... node) {
        if (node != null) {
            NodeModel temp = nodeFirst;
            while (true) {
            }
        }
    }

    /**
     * 删除node
     */
    public void del(String m) {
        if (nodeFirst == null) {
            System.out.println("链表无有效值");
        }
        NodeModel temp = nodeFirst;
        while (true) {
            if (temp.getNode().getM().equals(m)) {
                temp.setNode(temp.getNode().getNode());
            }
            temp = temp.getNode();
            if (temp.getNode() == null) {
                break;
            }
        }
    }

    public void update() {

    }
}

class NodeModel {
    private String m;
    private String n;
    private String q;
    private NodeModel node;

    public NodeModel(String m, String n, String q) {
        this.m = m;
        this.n = n;
        this.q = q;
    }

    @Override
    public String toString() {
        return "NodeModel{" +
                "m='" + m + '\'' +
                ", n='" + n + '\'' +
                ", q='" + q +
                '}';
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public NodeModel getNode() {
        return node;
    }

    public void setNode(NodeModel node) {
        this.node = node;
    }
}
