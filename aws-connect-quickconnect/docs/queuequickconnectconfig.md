# AWS::Connect::QuickConnect QueueQuickConnectConfig

The queue configuration. This is required only if QuickConnectType is QUEUE.

## Syntax

To declare this entity in your AWS CloudFormation template, use the following syntax:

### JSON

<pre>
{
    "<a href="#contactflowarn" title="ContactFlowArn">ContactFlowArn</a>" : <i>String</i>,
    "<a href="#queuearn" title="QueueArn">QueueArn</a>" : <i>String</i>
}
</pre>

### YAML

<pre>
<a href="#contactflowarn" title="ContactFlowArn">ContactFlowArn</a>: <i>String</i>
<a href="#queuearn" title="QueueArn">QueueArn</a>: <i>String</i>
</pre>

## Properties

#### ContactFlowArn

The identifier of the contact flow.

_Required_: Yes

_Type_: String

_Pattern_: <code>^arn:aws[-a-z0-9]*:connect:[-a-z0-9]*:[0-9]{12}:instance/[-a-zA-Z0-9]*/contact-flow/[-a-zA-Z0-9]*$</code>

_Update requires_: [No interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)

#### QueueArn

The identifier for the queue.

_Required_: Yes

_Type_: String

_Pattern_: <code>^arn:aws[-a-z0-9]*:connect:[-a-z0-9]*:[0-9]{12}:instance/[-a-zA-Z0-9]*/queue/[-a-zA-Z0-9]*$</code>

_Update requires_: [No interruption](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-no-interrupt)

