/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package tech.speckit.todolist.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TaskInfoEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7740117158123723584L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TaskInfoEvent\",\"namespace\":\"tech.speckit.todolist.avro\",\"fields\":[{\"name\":\"taskId\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TaskInfoEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TaskInfoEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TaskInfoEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TaskInfoEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TaskInfoEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TaskInfoEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TaskInfoEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TaskInfoEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TaskInfoEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Object taskId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TaskInfoEvent() {}

  /**
   * All-args constructor.
   * @param taskId The new value for taskId
   */
  public TaskInfoEvent(java.lang.Object taskId) {
    this.taskId = taskId;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return taskId;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: taskId = value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'taskId' field.
   * @return The value of the 'taskId' field.
   */
  public java.lang.Object getTaskId() {
    return taskId;
  }


  /**
   * Sets the value of the 'taskId' field.
   * @param value the value to set.
   */
  public void setTaskId(java.lang.Object value) {
    this.taskId = value;
  }

  /**
   * Creates a new TaskInfoEvent RecordBuilder.
   * @return A new TaskInfoEvent RecordBuilder
   */
  public static tech.speckit.todolist.avro.TaskInfoEvent.Builder newBuilder() {
    return new tech.speckit.todolist.avro.TaskInfoEvent.Builder();
  }

  /**
   * Creates a new TaskInfoEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TaskInfoEvent RecordBuilder
   */
  public static tech.speckit.todolist.avro.TaskInfoEvent.Builder newBuilder(tech.speckit.todolist.avro.TaskInfoEvent.Builder other) {
    if (other == null) {
      return new tech.speckit.todolist.avro.TaskInfoEvent.Builder();
    } else {
      return new tech.speckit.todolist.avro.TaskInfoEvent.Builder(other);
    }
  }

  /**
   * Creates a new TaskInfoEvent RecordBuilder by copying an existing TaskInfoEvent instance.
   * @param other The existing instance to copy.
   * @return A new TaskInfoEvent RecordBuilder
   */
  public static tech.speckit.todolist.avro.TaskInfoEvent.Builder newBuilder(tech.speckit.todolist.avro.TaskInfoEvent other) {
    if (other == null) {
      return new tech.speckit.todolist.avro.TaskInfoEvent.Builder();
    } else {
      return new tech.speckit.todolist.avro.TaskInfoEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for TaskInfoEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TaskInfoEvent>
    implements org.apache.avro.data.RecordBuilder<TaskInfoEvent> {

    private java.lang.Object taskId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(tech.speckit.todolist.avro.TaskInfoEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.taskId)) {
        this.taskId = data().deepCopy(fields()[0].schema(), other.taskId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing TaskInfoEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(tech.speckit.todolist.avro.TaskInfoEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.taskId)) {
        this.taskId = data().deepCopy(fields()[0].schema(), other.taskId);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'taskId' field.
      * @return The value.
      */
    public java.lang.Object getTaskId() {
      return taskId;
    }


    /**
      * Sets the value of the 'taskId' field.
      * @param value The value of 'taskId'.
      * @return This builder.
      */
    public tech.speckit.todolist.avro.TaskInfoEvent.Builder setTaskId(java.lang.Object value) {
      validate(fields()[0], value);
      this.taskId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'taskId' field has been set.
      * @return True if the 'taskId' field has been set, false otherwise.
      */
    public boolean hasTaskId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'taskId' field.
      * @return This builder.
      */
    public tech.speckit.todolist.avro.TaskInfoEvent.Builder clearTaskId() {
      taskId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TaskInfoEvent build() {
      try {
        TaskInfoEvent record = new TaskInfoEvent();
        record.taskId = fieldSetFlags()[0] ? this.taskId :  defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TaskInfoEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<TaskInfoEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TaskInfoEvent>
    READER$ = (org.apache.avro.io.DatumReader<TaskInfoEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










