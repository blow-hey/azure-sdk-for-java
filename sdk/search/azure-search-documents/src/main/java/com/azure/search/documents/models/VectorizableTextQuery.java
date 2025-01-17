// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/** The query parameters to use for vector search when a text value that needs to be vectorized is provided. */
@Fluent
public final class VectorizableTextQuery extends VectorQuery {
    /*
     * The kind of vector query being performed.
     */
    private static final VectorQueryKind KIND = VectorQueryKind.TEXT;

    /*
     * The text to be vectorized to perform a vector search query.
     */
    private String text;

    /** Creates an instance of VectorizableTextQuery class. */
    public VectorizableTextQuery() {}

    /**
     * Get the text property: The text to be vectorized to perform a vector search query.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text to be vectorized to perform a vector search query.
     *
     * @param text the text value to set.
     * @return the VectorizableTextQuery object itself.
     */
    public VectorizableTextQuery setText(String text) {
        this.text = text;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VectorizableTextQuery setKNearestNeighborsCount(Integer kNearestNeighborsCount) {
        super.setKNearestNeighborsCount(kNearestNeighborsCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VectorizableTextQuery setFields(String... fields) {
        super.setFields(fields);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VectorizableTextQuery setExhaustive(Boolean exhaustive) {
        super.setExhaustive(exhaustive);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", Objects.toString(KIND, null));
        jsonWriter.writeNumberField("k", getKNearestNeighborsCount());
        jsonWriter.writeStringField("fields", getFields());
        jsonWriter.writeBooleanField("exhaustive", isExhaustive());
        jsonWriter.writeStringField("text", this.text);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VectorizableTextQuery from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of VectorizableTextQuery if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the VectorizableTextQuery.
     */
    public static VectorizableTextQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    VectorizableTextQuery deserializedVectorizableTextQuery = new VectorizableTextQuery();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("kind".equals(fieldName)) {
                            String kind = reader.getString();
                            if (!KIND.toString().equals(kind)) {
                                throw new IllegalStateException(
                                        "'kind' was expected to be non-null and equal to '"
                                                + KIND
                                                + "'. The found 'kind' was '"
                                                + kind
                                                + "'.");
                            }
                        } else if ("k".equals(fieldName)) {
                            deserializedVectorizableTextQuery.setKNearestNeighborsCount(
                                    reader.getNullable(JsonReader::getInt));
                        } else if ("fields".equals(fieldName)) {
                            deserializedVectorizableTextQuery.setFields(reader.getString());
                        } else if ("exhaustive".equals(fieldName)) {
                            deserializedVectorizableTextQuery.setExhaustive(reader.getNullable(JsonReader::getBoolean));
                        } else if ("text".equals(fieldName)) {
                            deserializedVectorizableTextQuery.text = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedVectorizableTextQuery;
                });
    }
}
