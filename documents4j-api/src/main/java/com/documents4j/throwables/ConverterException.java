package com.documents4j.throwables;

/**
 * A general exception thrown by the methods in {@link com.documents4j.api.IConverter}.
 * This exception is the common subclass of more specialized exceptions. All exceptions thrown
 * by the {@link com.documents4j.api.IConverter} are unchecked.
 * <p>&nbsp;</p>
 * <i>Note</i>: Be aware that exception precedence is not specified. For example, when an unreachable
 * converter is asked to convert an inexistent file, this might either result in a
 * {@link FileSystemInteractionException} or in a {@link ConverterAccessException}, depending on the
 * converter implementation.
 *
 * @see ConversionInputException
 * @see ConverterAccessException
 * @see FileSystemInteractionException
 */
public class ConverterException extends RuntimeException {

    public ConverterException(String message) {
        super(message);
    }

    public ConverterException(String message, Throwable cause) {
        super(message, cause);
    }
}
