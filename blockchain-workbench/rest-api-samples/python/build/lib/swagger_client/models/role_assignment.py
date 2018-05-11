# coding: utf-8

"""
    Azure Blockchain Workbench REST API

    The Azure Blockchain Workbench REST API is a Workbench extensibility point, which allows developers to create and manage blockchain applications, manage users and organizations within a consortium, integrate blockchain applications into services and platforms, perform transactions on a blockchain, and retrieve transactional and contract data from a blockchain.  # noqa: E501

    OpenAPI spec version: v1
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from swagger_client.models.user import User  # noqa: F401,E501


class RoleAssignment(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'id': 'int',
        'application_role_id': 'int',
        'user': 'User'
    }

    attribute_map = {
        'id': 'id',
        'application_role_id': 'applicationRoleId',
        'user': 'user'
    }

    def __init__(self, id=None, application_role_id=None, user=None):  # noqa: E501
        """RoleAssignment - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._application_role_id = None
        self._user = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if application_role_id is not None:
            self.application_role_id = application_role_id
        if user is not None:
            self.user = user

    @property
    def id(self):
        """Gets the id of this RoleAssignment.  # noqa: E501


        :return: The id of this RoleAssignment.  # noqa: E501
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RoleAssignment.


        :param id: The id of this RoleAssignment.  # noqa: E501
        :type: int
        """

        self._id = id

    @property
    def application_role_id(self):
        """Gets the application_role_id of this RoleAssignment.  # noqa: E501


        :return: The application_role_id of this RoleAssignment.  # noqa: E501
        :rtype: int
        """
        return self._application_role_id

    @application_role_id.setter
    def application_role_id(self, application_role_id):
        """Sets the application_role_id of this RoleAssignment.


        :param application_role_id: The application_role_id of this RoleAssignment.  # noqa: E501
        :type: int
        """

        self._application_role_id = application_role_id

    @property
    def user(self):
        """Gets the user of this RoleAssignment.  # noqa: E501


        :return: The user of this RoleAssignment.  # noqa: E501
        :rtype: User
        """
        return self._user

    @user.setter
    def user(self, user):
        """Sets the user of this RoleAssignment.


        :param user: The user of this RoleAssignment.  # noqa: E501
        :type: User
        """

        self._user = user

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, RoleAssignment):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
