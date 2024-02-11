import {
  Button,
  Card,
  Flex,
  FormControl,
  FormLabel,
  HStack,
  Input,
  Stack,
  Text,
  Textarea,
} from "@chakra-ui/react";
import { useEffect } from "react";

const LoginForm = () => {
  useEffect(() => {
    document.title = "Login";
  }, []);
  return (
    <Flex justifyContent="center" alignItems="center" mt="20px">
      <Card p="24px" flexGrow={1} maxW="900px" border="1px solid black">
        <Stack alignItems="center">
          <Text fontWeight="medium" fontSize="xx-large">
            Resume Filter
          </Text>
        </Stack>
        <Stack spacing="20px" mt="30px">
          <HStack
            flexDir={{
              base: "column",
              md: "row",
            }}
          >
            <FormControl isRequired>
              <FormLabel>First Name</FormLabel>
              <Input type="text" placeholder="Enter your first name...." />
            </FormControl>
            <FormControl isRequired>
              <FormLabel>Last Name</FormLabel>
              <Input type="text" placeholder="Enter your last name...." />
            </FormControl>
          </HStack>
          <HStack
            flexDir={{
              base: "column",
              md: "row",
            }}
          >
            <FormControl isRequired>
              <FormLabel>Email</FormLabel>
              <Input type="email" placeholder="Enter your email...." />
            </FormControl>
            <FormControl isRequired>
              <FormLabel>Phone Number</FormLabel>
              <Input type="text" placeholder="Enter your phone number...." />
            </FormControl>
          </HStack>
          <HStack
            flexDir={{
              base: "column",
              md: "row",
            }}
          >
            <FormControl isRequired>
              <FormLabel>Experience (in Years)</FormLabel>
              <Input type="number" placeholder="Enter your experience...." />
            </FormControl>
            <FormControl isRequired>
              <FormLabel>Current Job Title</FormLabel>
              <Input type="text" placeholder="Enter your job title...." />
            </FormControl>
          </HStack>
          <HStack
            flexDir={{
              base: "column",
              md: "row",
            }}
          >
            <FormControl isRequired>
              <FormLabel>Highest Qualification Held</FormLabel>
              <Input
                type="text"
                placeholder="Enter your highest qualification...."
              />
            </FormControl>
            <FormControl isRequired>
              <FormLabel>Current Work Location</FormLabel>
              <Input type="text" placeholder="Enter your location...." />
            </FormControl>
          </HStack>
          <HStack
            flexDir={{
              base: "column",
              md: "row",
            }}
          >
            <FormControl isRequired>
              <FormLabel>City</FormLabel>
              <Input type="text" placeholder="Enter your city...." />
            </FormControl>
            <FormControl isRequired>
              <FormLabel>Zip Code</FormLabel>
              <Input type="number" placeholder="Enter your zip code...." />
            </FormControl>
          </HStack>
          <FormControl isRequired>
            <FormLabel>Skill set</FormLabel>
            <Textarea placeholder="Enter your skills...." />
          </FormControl>
          <FormControl isRequired>
            <Flex flexDir="row">
              <FormLabel>Upload Resume</FormLabel>
              <Button p="5px" fontSize="sm">
                choose...
              </Button>
            </Flex>
          </FormControl>
          <Button color="black" fontSize="sm">
            Submit
          </Button>
        </Stack>
      </Card>
    </Flex>
  );
};

export default LoginForm;
