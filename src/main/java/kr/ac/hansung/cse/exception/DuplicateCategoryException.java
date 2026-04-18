package kr.ac.hansung.cse.exception;

// 커스텀 익셉션, 카테고리 중복 방지를 위한 예외처리
public class DuplicateCategoryException extends RuntimeException {
    private final String categoryName;

    public DuplicateCategoryException(String name) {
        super("이미 존재하는 카테고리입니다: " + name);
        this.categoryName = name;
    }

    public String getCategoryName() { return categoryName; }
}
