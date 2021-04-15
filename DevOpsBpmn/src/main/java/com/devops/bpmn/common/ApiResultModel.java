package com.devops.bpmn.common;

/**
 * API请求返回模型类
 *
 * @author will
 * @see [相关类/方法]（必须）
 * @since [V3.0] （可选）
 */
public class ApiResultModel
{
    /**
     * 代表操作是否成功执行
     */
    private boolean success = true;
    
    /**
     * 代表操作提示信息
     */
    private String message = "";
    
    /**
     * 代表操作返回的结果数据
     */
    private Object data = null;
    
    /**
     * 代表操作返回的资源唯一标示。
     */
    private String sujectId = "";
    
    @Override
    public String toString()
    {
        return "ApiResultModel{" + "success=" + success + ", message='" + message + '\'' + ", data=" + data
                + ", sujectId='" + sujectId + '\'' + '}';
    }
    
    /**
     * 缺少参数统一提示
     */
    public static final String PARAMETER_DELETION = "缺少必要参数";
    
    /**
     * 参数类型或格式错误统一提示
     */
    public static final String PARAMETER_ERROR = "参数%s类型或格式错误";
    
    public boolean isSuccess()
    {
        return success;
    }
    
    public void setSuccess(boolean success)
    {
        this.success = success;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    public Object getData()
    {
        return data;
    }
    
    public void setData(Object data)
    {
        this.data = data;
    }
    
    public String getSujectId()
    {
        return sujectId;
    }
    
    public void setSujectId(String sujectId)
    {
        this.sujectId = sujectId;
    }
    
    /**
     * 参数缺失message
     * @param parameter 参数
     */
    public static ApiResultModel parameterDeletionMessage(String parameter)
    {
        ApiResultModel apiResultModel = new ApiResultModel();
        apiResultModel.setSuccess(false);
        apiResultModel.setMessage(PARAMETER_DELETION + parameter);
        return apiResultModel;
    }
    
    /**
     * 参数类型或格式错误message
     * @param parameter 参数
     */
    public static ApiResultModel parameterErrorMessage(String parameter)
    {
        ApiResultModel apiResultModel = new ApiResultModel();
        apiResultModel.setSuccess(false);
        apiResultModel.setMessage(String.format(PARAMETER_ERROR, parameter));
        return apiResultModel;
    }
    
    public static ApiResultModel errorMessage(String errorMessage)
    {
        ApiResultModel apiResultModel = new ApiResultModel();
        apiResultModel.setSuccess(false);
        apiResultModel.setMessage(errorMessage);
        return apiResultModel;
    }
    
    public static ApiResultModel successMessage(String message)
    {
        ApiResultModel apiResultModel = new ApiResultModel();
        apiResultModel.setSuccess(true);
        apiResultModel.setMessage(message);
        return apiResultModel;
    }
    
    public static ApiResultModel successData(Object data)
    {
        ApiResultModel apiResultModel = new ApiResultModel();
        apiResultModel.setSuccess(true);
        apiResultModel.setData(data);
        return apiResultModel;
    }
    
    public static ApiResultModel successMessageAndData(String message, Object data)
    {
        ApiResultModel apiResultModel = new ApiResultModel();
        apiResultModel.setSuccess(true);
        apiResultModel.setMessage(message);
        apiResultModel.setData(data);
        return apiResultModel;
    }
}
