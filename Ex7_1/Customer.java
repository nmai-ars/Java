package Ex7_1;

public class Customer {
    private String name;
    private boolean member;
    private String memberType; // "Premium", "Gold", hoặc "Silver"

    public Customer(String name) {
        this.name = name;
        this.member = false;
        this.memberType = "None"; // hoặc để trống
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}

