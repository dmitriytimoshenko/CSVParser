package csvserv;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvNumber;

public class Data {
    @CsvBindByName(column = "nomen")
    @CsvBindByPosition(position = 0)
    private String nomen;
    @CsvBindByName(column = "brend")
    @CsvBindByPosition(position = 1)
    private String brend;
    @CsvBindByName(column = "article")
    @CsvBindByPosition(position = 2)
    private String article;
    @CsvBindByName(column = "description")
    @CsvBindByPosition(position = 3)
    private String description;
    @CsvBindByName(column = "weightVolume", locale = "ru-RU")
    @CsvNumber("####.##")
    @CsvBindByPosition(position = 4)
    private double weightVolume;
    @CsvBindByName(column = "krat")
    @CsvBindByPosition(position = 5)
    private int krat;
    @CsvBindByName(column = "sum", locale = "ru-RU")
    @CsvNumber("####.##")
    @CsvBindByPosition(position = 6)
    private double sum;
    @CsvBindByName(column = "baseSum", locale = "ru-RU")
    @CsvNumber("####.##")
    @CsvBindByPosition(position = 7)
    private double baseSum;
    @CsvBindByName(column = "quant")
    @CsvBindByPosition(position = 8)
    private String quant;
    @CsvBindByName(column = "days")
    @CsvBindByPosition(position = 9)
    private String days;
    @CsvBindByName(column = "number")
    @CsvBindByPosition(position = 10)
    private String number;
    @CsvBindByName(column = "oem")
    @CsvBindByPosition(position = 11)
    private String oem;
    @CsvBindByName(column = "nameDesc")
    @CsvBindByPosition(position = 12)
    private String nameDesc;
    @CsvBindByName(column = "vendor")
    @CsvBindByPosition(position = 13)
    private String vendor;

    public String getNomen() {
        return nomen;
    }

    public void setNomen(String nomen) {
        this.nomen = nomen;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeightVolume() {
        return weightVolume;
    }

    public void setWeightVolume(double weightVolume) {
        this.weightVolume = weightVolume;
    }

    public int getKrat() {
        return krat;
    }

    public void setKrat(int krat) {
        this.krat = krat;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getBaseSum() {
        return baseSum;
    }

    public void setBaseSum(double baseSum) {
        this.baseSum = baseSum;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public String getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return "Data{" +
                "nomen='" + nomen + '\'' +
                ", brend='" + brend + '\'' +
                ", article='" + article + '\'' +
                ", description='" + description + '\'' +
                ", weightVolume=" + weightVolume +
                ", krat=" + krat +
                ", sum=" + sum +
                ", baseSum=" + baseSum +
                ", quant=" + quant +
                ", days=" + days +
                ", number='" + number + '\'' +
                ", oem='" + oem + '\'' +
                ", nameDesc='" + nameDesc + '\'' +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
