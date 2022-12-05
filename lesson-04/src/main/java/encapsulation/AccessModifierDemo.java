package encapsulation;

// Access Modifier: Phạm vi truy cập
// public, protected, default, private
// Dùng class, method, property

import encapsulation.entity.Student;

// public: Có thể truy cập từ khắp mọi nơi
// protected: Không thể truy đc từ package khác
// default: Không thể truy đc từ package khác
// private: Chỉ truy cập được từ chính class đó
public class AccessModifierDemo {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
