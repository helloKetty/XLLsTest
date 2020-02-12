package test.枚举;

public enum Race {
    WHITE("白色", "渣渣"), BLACK("黑色", "渣渣1"), YELLOW("黄色", "渣渣2");
    private String label;
    private String label2;

    Race(String label, String label2) {
        this.label = label;
        this.label2 = label2;
    }

    public String getLabel() {
        return label;
    }

    public String getLabel2() {
        return label2;
    }
}
