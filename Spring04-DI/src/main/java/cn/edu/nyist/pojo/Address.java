package cn.edu.nyist.pojo;

/**
 * Description:
 *
 * @author 张志鹏
 * @date 2022/2/14 21:12
 * @email p2hemia@nyist.edu.cn
 **/
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
