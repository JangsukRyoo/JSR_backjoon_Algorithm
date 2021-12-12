import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSR {
    private String name ;
    private int schoolNum ;
    private String email;
    private String birth ;

    public JSR() {
        super();
    }
    public JSR(String name, int schoolNum, String email, String birth){
        super();
        this.name = name;
        this.schoolNum = schoolNum;
        this.email = email;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolNum(int schoolNum) {
        this.schoolNum = schoolNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getSchoolNum() {
        return schoolNum;
    }

    public String getEmail() {
        return email;
    }

    public String getBirth() {
        return birth;
    }

    public String show(String name) {
        return "<출력결과: \n" + "          \"개발자의 이름은 " + name+ " 입니다. \">";
    }

    public String show(String name, String email) {
        return "<출력결과: \n" + "          개발자의 이름은 " + name+ " 입니다.\n"
                + "          " + email + " 메일을 사용합니다. \">";
    }

    public String show(String name, String email, String birth) {

        Date nowDate  = new Date();
        String today = null;
        String birthDay =null;
        int cYear = nowDate.getYear();
        int cMonth = nowDate.getMonth();
        int cDay = nowDate.getDay();
        int age = 0;

        SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

        try {
            Date formatDate = dtFormat.parse(birth);
            int bYear = formatDate.getYear();
            int bMonth = formatDate.getMonth();
            int bDay = formatDate.getDay();

             today = simpleDateFormat.format(nowDate);
             birthDay = simpleDateFormat.format(formatDate);
             age = cYear - bYear;
             if((bMonth*100 + bDay) > (cMonth*100 +cDay)){
                 age--;
             }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "<출력결과: \n" + "          개발자의 이름은" + name+ " 입니다.\n"
                + "          " + "오늘 날짜는 "+today+"입니다.\n"
                + "          " +  "생년월일은 " + birthDay + "로 만 "+age+"세 입니다.\">";
    }
}

