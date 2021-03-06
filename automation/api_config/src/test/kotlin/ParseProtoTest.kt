import api.config.ParseProto
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ParseProtoTest {

    private val expectedConfig = """
# Note: Auto generated file. Do not edit!
# https://github.com/googleapis/googleapis/blob/master/google/api/service.proto
type: google.api.Service
config_version: 3

# https://cloud.google.com/endpoints/docs/grpc/configure-endpoints
# YOUR_API_NAME.endpoints.YOUR_PROJECT_ID.cloud.goog
name: soseedy.endpoints.delta-essence-114723.cloud.goog

title: SoSeedy gRPC API
apis:
- name: soseedy.SeedyModules
- name: soseedy.SeedyGroups
- name: soseedy.SeedyCourses
- name: soseedy.SeedyQuizzes
- name: soseedy.SeedySections
- name: soseedy.SeedyAssignments
- name: soseedy.SeedyEnrollments
- name: soseedy.SeedyGradingPeriods
- name: soseedy.SeedyObservers
- name: soseedy.SeedyFeatureFlags
- name: soseedy.SeedyGeneral
- name: soseedy.SeedyConversations
- name: soseedy.SeedyPages
- name: soseedy.SeedyDiscussions
- name: soseedy.SeedyFiles
- name: soseedy.SeedyUsers

usage:
  rules:
  - selector: soseedy.SeedyGeneral.GetHealthCheck
    allow_unregistered_calls: true

endpoints:
- name: soseedy.endpoints.delta-essence-114723.cloud.goog
  target: "35.224.49.193"
    """.trimIndent()

    @Test
    fun testGenerateApiConfig() {
        assertThat(ParseProto.generateApiConfig())
                .isEqualTo(expectedConfig)

    }
}
