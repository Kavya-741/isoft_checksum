package com.finakon.baas.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import com.finakon.baas.entities.IdClasses.MaintEntityAuditSubgroupMappingId;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="maint_entity_audit_subgroup_mapping_wrk")
@IdClass(MaintEntityAuditSubgroupMappingId.class)
public class MaintEntityAuditSubgroupMappingWrk {
	@Id
	@Column(name="legal_entity_code")
	private Integer legalEntityCode;

	@Id
	@Column(name="mapping_type")
	private String mappingType;
	
	@Id
	@Column(name="id")
	private String id;
	
	@Id
	@Column(name="audit_type_code")
	private String auditTypeCode;
	
	@Id
	@Column(name="audit_group_code")
	private String auditGroupCode;
	
	@Id
	@Column(name="audit_sub_group_code")
	private String auditSubGroupCode;
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="maker")
	private String maker;
	
	@Column(name="maker_timestamp")
	private Date makerTimestamp;
	
	@Column(name="checker")
	private String checker;
	
	@Column(name="checker_timestamp")
	private Date checkerTimestamp;
		
	@Column(name="auth_unique_id")
	private String authUniqueId;	

	
}