package app;

public class MobilePhone {

    private String system;
    private int resolution;
    //Może być też LocalDateTime
    private int productionYear;

    public MobilePhone() {
    }

    public MobilePhone(String system, int resolution, int productionYear) {
        this.system = system;
        this.resolution = resolution;
        this.productionYear = productionYear;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "system='" + system + '\'' +
                ", resolution=" + resolution +
                ", productionYear=" + productionYear +
                '}';
    }
}
