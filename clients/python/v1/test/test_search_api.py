"""
    Nomad

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.1.3
    Contact: support@hashicorp.com
    Generated by: https://openapi-generator.tech
"""


import unittest

import nomad_client
from nomad_client.api.search_api import SearchApi  # noqa: E501


class TestSearchApi(unittest.TestCase):
    """SearchApi unit test stubs"""

    def setUp(self):
        self.api = SearchApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_fuzzy_search(self):
        """Test case for get_fuzzy_search

        """
        pass

    def test_get_search(self):
        """Test case for get_search

        """
        pass


if __name__ == '__main__':
    unittest.main()
