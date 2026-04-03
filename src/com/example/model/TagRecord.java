
package com.example.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * TagRecord 实体类
 * 数据实体定义
 * 
 * @author Auto Generated
 * @version 1.0
 * @date 2026-04-03
 */
public class TagRecord implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 主键 ID
     */
    private Long id;
    
    /**
     * 名称
     */
    private String name;
    
    /**
     * 描述
     */
    private String description;
    
    /**
     * 状态：0-禁用，1-启用
     */
    private Integer status;
    
    /**
     * 创建时间
     */
    private LocalDateTime createdAt;
    
    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;
    
    /**
     * 默认构造函数
     */
    public TagRecord() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.status = 1;
    }
    
    /**
     * 带参构造函数
     * 
     * @param id 主键 ID
     * @param name 名称
     * @param description 描述
     */
    public TagRecord(Long id, String name, String description) {
        this();
        this.id = id;
        this.name = name;
        this.description = description;
    }
    
    // Getters and Setters
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
        this.updatedAt = LocalDateTime.now();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
        this.updatedAt = LocalDateTime.now();
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    }
    
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TagRecord that = (TagRecord) o;
        return Objects.equals(id, that.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "TagRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                '}';
    }
}
