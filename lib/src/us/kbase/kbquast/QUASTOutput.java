
package us.kbase.kbquast;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: QUASTOutput</p>
 * <pre>
 * Ouput of the run_quast function.
 * shock_id - the id of the shock node where the zipped QUAST output is stored.
 * handle - the new handle for the shock node, if created.
 * node_file_name - the name of the file stored in Shock.
 * size - the size of the file stored in shock.
 * quast_path - the directory containing the quast output and the zipfile of the directory.
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "shock_id",
    "handle",
    "node_file_name",
    "size",
    "quast_path"
})
public class QUASTOutput {

    @JsonProperty("shock_id")
    private String shockId;
    /**
     * <p>Original spec-file type: Handle</p>
     * <pre>
     * A handle for a file stored in Shock.
     * hid - the id of the handle in the Handle Service that references this shock node
     * id - the id for the shock node
     * url - the url of the shock server
     * type - the type of the handle. This should always be shock.
     * file_name - the name of the file
     * remote_md5 - the md5 digest of the file.
     * </pre>
     * 
     */
    @JsonProperty("handle")
    private Handle handle;
    @JsonProperty("node_file_name")
    private String nodeFileName;
    @JsonProperty("size")
    private String size;
    @JsonProperty("quast_path")
    private String quastPath;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shock_id")
    public String getShockId() {
        return shockId;
    }

    @JsonProperty("shock_id")
    public void setShockId(String shockId) {
        this.shockId = shockId;
    }

    public QUASTOutput withShockId(String shockId) {
        this.shockId = shockId;
        return this;
    }

    /**
     * <p>Original spec-file type: Handle</p>
     * <pre>
     * A handle for a file stored in Shock.
     * hid - the id of the handle in the Handle Service that references this shock node
     * id - the id for the shock node
     * url - the url of the shock server
     * type - the type of the handle. This should always be shock.
     * file_name - the name of the file
     * remote_md5 - the md5 digest of the file.
     * </pre>
     * 
     */
    @JsonProperty("handle")
    public Handle getHandle() {
        return handle;
    }

    /**
     * <p>Original spec-file type: Handle</p>
     * <pre>
     * A handle for a file stored in Shock.
     * hid - the id of the handle in the Handle Service that references this shock node
     * id - the id for the shock node
     * url - the url of the shock server
     * type - the type of the handle. This should always be shock.
     * file_name - the name of the file
     * remote_md5 - the md5 digest of the file.
     * </pre>
     * 
     */
    @JsonProperty("handle")
    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public QUASTOutput withHandle(Handle handle) {
        this.handle = handle;
        return this;
    }

    @JsonProperty("node_file_name")
    public String getNodeFileName() {
        return nodeFileName;
    }

    @JsonProperty("node_file_name")
    public void setNodeFileName(String nodeFileName) {
        this.nodeFileName = nodeFileName;
    }

    public QUASTOutput withNodeFileName(String nodeFileName) {
        this.nodeFileName = nodeFileName;
        return this;
    }

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    public QUASTOutput withSize(String size) {
        this.size = size;
        return this;
    }

    @JsonProperty("quast_path")
    public String getQuastPath() {
        return quastPath;
    }

    @JsonProperty("quast_path")
    public void setQuastPath(String quastPath) {
        this.quastPath = quastPath;
    }

    public QUASTOutput withQuastPath(String quastPath) {
        this.quastPath = quastPath;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((("QUASTOutput"+" [shockId=")+ shockId)+", handle=")+ handle)+", nodeFileName=")+ nodeFileName)+", size=")+ size)+", quastPath=")+ quastPath)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
