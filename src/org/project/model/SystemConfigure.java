package org.project.model;

public class SystemConfigure {

	private Integer id;
	
	private Integer configType;

	private String configTypeName;

	private Integer configTypeValue;

	private String configValue;
	
	private Integer isStart;
	
	
	
	

	public Integer getIsStart() {
		return isStart;
	}

	public void setIsStart(Integer isStart) {
		this.isStart = isStart;
	}

	public SystemConfigure() {
		super();
	}
    
	public SystemConfigure(Integer configType, String configTypeName, Integer configTypeValue, String configValue) {
		super();
		this.configType = configType;
		this.configTypeName = configTypeName;
		this.configTypeValue = configTypeValue;
		this.configValue = configValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getConfigType() {
		return configType;
	}

	public void setConfigType(Integer configType) {
		this.configType = configType;
	}

	public String getConfigTypeName() {
		return configTypeName;
	}

	public void setConfigTypeName(String configTypeName) {
		this.configTypeName = configTypeName;
	}

	public Integer getConfigTypeValue() {
		return configTypeValue;
	}

	public void setConfigTypeValue(Integer configTypeValue) {
		this.configTypeValue = configTypeValue;
	}

	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}

	@Override
	public String toString() {
		return "SystemConfigure [id=" + id + ", configType=" + configType + ", configTypeName=" + configTypeName
				+ ", configTypeValue=" + configTypeValue + ", configValue=" + configValue + ", isStart=" + isStart
				+ "]";
	}

	
	

}
