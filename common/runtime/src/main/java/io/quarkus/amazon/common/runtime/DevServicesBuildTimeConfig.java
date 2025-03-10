package io.quarkus.amazon.common.runtime;

import java.util.Map;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class DevServicesBuildTimeConfig {

    /**
     * If a local AWS stack should be used. (default to true)
     *
     * If this is true and endpoint-override is not configured then a local AWS stack
     * will be started and will be used instead of the given configuration.
     * For all services but Cognito, the local AWS stack will be provided by LocalStack.
     * Otherwise, it will be provided by Moto
     */
    @ConfigItem
    public Optional<Boolean> enabled = Optional.empty();

    /**
     * Indicates if the LocalStack container managed by Dev Services is shared.
     * When shared, Quarkus looks for running containers using label-based service discovery.
     * If a matching container is found, it is used, and so a second one is not started.
     * Otherwise, Dev Services starts a new container.
     * <p>
     * The discovery uses the {@code quarkus-dev-service-localstack} label.
     * The value is configured using the {@code service-name} property.
     * <p>
     * Sharing is not supported for the Cognito extension.
     * <p>
     */
    @ConfigItem(defaultValue = "false")
    public boolean shared;

    /**
     * The value of the {@code quarkus-dev-service-localstack} label attached to the started container.
     * In dev mode, when {@code shared} is set to {@code true}, before starting a container, Dev Services looks for a container
     * with the
     * {@code quarkus-dev-service-localstack} label
     * set to the configured value. If found, it will use this container instead of starting a new one. Otherwise it
     * starts a new container with the {@code quarkus-dev-service-localstack} label set to the specified value.
     * In test mode, Dev Services will group services with the same {@code service-name} value in one container instance.
     * <p>
     * This property is used when you need multiple shared LocalStack instances.
     */
    @ConfigItem(defaultValue = "localstack")
    public String serviceName;

    /**
     * Generic properties that are pass for additional container configuration.
     */
    @ConfigItem
    public Map<String, String> containerProperties;
}
