package Com.Merca.Mercarue.models;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table 
public class wor7428_woof_query_cache {
	@Id
	@Column(columnDefinition = "VARCHAR(64) COLLATE utf8mb4_unicode_520_ci")

	private String  mkey;
	
	@Column(columnDefinition = "TEXT COLLATE utf8mb4_unicode_520_ci")
	 String mvalue ;
}
