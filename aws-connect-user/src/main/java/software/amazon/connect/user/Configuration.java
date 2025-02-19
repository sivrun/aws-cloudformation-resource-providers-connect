package software.amazon.connect.user;

import java.util.Map;
import java.util.stream.Collectors;

class Configuration extends BaseConfiguration {

    public Configuration() {
        super("aws-connect-user.json");
    }

    @Override
    public Map<String, String> resourceDefinedTags(final ResourceModel resourceModel) {
        if (resourceModel.getTags() == null) {
            return null;
        } else {
            return resourceModel.getTags().stream().collect(Collectors.toMap(Tag::getKey, Tag::getValue, (value1, value2) -> value2));
        }
    }
}