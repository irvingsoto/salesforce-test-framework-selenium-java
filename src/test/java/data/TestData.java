package data;

public enum TestData {

    TEST_DATA_01("https://developer.salesforce.com/docs/component-library/documentation/en/48.0/lwc",
            "firefox",
            "datatable",
            "Data Table with Inline Edit",
            "Larry Page",
            "https://google.com",
            "(555)-755-6575",
            "Mar 1, 2022",
            "12:57 PM",
            "Data Table with Row Actions",
            "770.54");


   // TEST_DATA_02("somedata",
     //               "somedata",
       //     "sometada");

    private final String url;
    private final String browser;
    private final String findFor;
    private final String drpExampleOption;
    private final String label;
    private final String website;
    private final String phone;
    private final String date;
    private final String time;
    private final String balance;
    private final String drpExampleOption2;

    TestData(String url, String browser, String findFor, String drpExampleOption, String label, String website, String phone,String date,String time,
        String balance, String drpExampleOption2
    ) {
        this.url = url;
        this.browser = browser;
        this.findFor= findFor;
        this.drpExampleOption= drpExampleOption;
        this.label= label;
        this.website= website;
        this.phone= phone;
        this.date= date;
        this.time= time;
        this.balance= balance;
        this.drpExampleOption2= drpExampleOption2;
    }

    public String getUrl() {
        return url;
    }
    public String getBrowser() {
        return browser;
    }
    public String getFindFor() {
        return findFor;
    }
    public String getDrpExampleOption() { return drpExampleOption; }
    public String getLabel() { return label; }
    public String getWebsite() { return website; }
    public String getPhone() { return phone; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getBalance() { return balance; }
    public String getDrpExampleOption2() { return drpExampleOption2; }




}

