package gshop.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass //Base Entity를 상속하면 JPA가 아래 필드들을 하나의 필드로 인식한다.
@EntityListeners(AuditingEntityListener.class) //자주 사용하는 기능들을 정의해놓은 기능 [CreatedBy(작성자) , @CreatedDate(작성일) @LastModifiedDate(수정일) @LastModifiedBy]
public abstract class BaseEntity {

    //@CreatedBy
    private Long creUser;
    @CreatedDate
    private LocalDateTime creDate;
    //@LastModifiedBy
    private Long modUser;
    @LastModifiedDate
    private LocalDateTime modDate;
}

