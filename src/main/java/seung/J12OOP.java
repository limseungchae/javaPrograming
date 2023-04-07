package seung;

public class J12OOP {
    public static void main(String[] args) {
        Person2 p1 = new Person2();

        // setter로 변수 초기화
        p1.setName("혜교");
        p1.setJob("학생");
        p1.setAge(35);
        p1.setGender('여');

        // 객체 출력
        System.out.println(p1.getName());
        System.out.println(p1.getJob());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());

        // 객체 출력 2
        System.out.println(p1);

    }
}
class Person2 {
    // 멤버변수 캡슐화
    // 접근 제한자를 이용해서 멤버변수의 직접 접근을 막음
    private String name;
    private String job;
    private int age;
    private char gender;

    public Person2() {
    } // 기본생성자

    // getter / setter 선언
    // private으로 선언된 변수를 외부에 접근할 수 있도록
    // 정의하는 특수한 메서드

    // getXxx
    public String getName() {
        return name;
    }

    public String getJob() {
        return  job;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // setXxx
    public void setName(String name) {
        this.name = name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString : 모든 멤버변수의 값을 출력할때 사용하는 메서드
    @Override
    public String toString() {
        String fmt = "%s %s %d %s\n";
        return String.format(fmt, name, job, age, gender);
    }
}
