package Com.Merca.Mercarue.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data

@Entity
@Table
public class wor7428_yith_wapo_blocks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	@Column( columnDefinition = "int(4)")
	private Long id;
	  
	@Column( columnDefinition = "bigint(20)")
	private Long user_id;
	
	@Column( columnDefinition = "bigint(20)")
	private Long vendor_id;
	
	
	  
	@Column( columnDefinition = "decimal(9,4)")
	private Long priority;
	
	@Column( columnDefinition = "tinyint(1)")
	private Long deleted;
	  
	@Column( columnDefinition = "int(1)")
	private Long visibility;
	
	
	 
	   @Column(columnDefinition = "LONGTEXT COLLATE utf8mb4_unicode_520_ci")
			 String settings ;
	   
		LocalDateTime 	 creation_date ;
		 LocalDateTime last_update ;
}
