package fossils.fossils.client.blockentity.model.kranosaura;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KranosauraFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightLeg4;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body;
	private final ModelPart chest;
	private final ModelPart armL;
	private final ModelPart armL2;
	private final ModelPart armL3;
	private final ModelPart armL4;
	private final ModelPart armL5;
	private final ModelPart armL6;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart jaw;

	public KranosauraFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body = this.hips.getChild("body");
		this.chest = this.body.getChild("chest");
		this.armL = this.chest.getChild("armL");
		this.armL2 = this.armL.getChild("armL2");
		this.armL3 = this.armL2.getChild("armL3");
		this.armL4 = this.chest.getChild("armL4");
		this.armL5 = this.armL4.getChild("armL5");
		this.armL6 = this.armL5.getChild("armL6");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create().texOffs(26, 71).addBox(1.0F, -1.6941F, 12.6822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(25, 47).addBox(-1.0F, -2.1941F, 10.6822F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.007F))
				.texOffs(25, 38).addBox(2.0F, -2.1941F, 12.6822F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F))
				.texOffs(26, 71).mirror().addBox(-2.0F, -1.6941F, 12.6822F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 38).mirror().addBox(-3.0F, -2.1941F, 12.6822F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r1 = hips.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(63, 89).mirror().addBox(0.0F, -0.6661F, -0.012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.7059F, 15.5822F, 0.327F, 0.158F, -0.5295F));

		PartDefinition cube_r2 = hips.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(37, 86).mirror().addBox(0.0F, -0.4061F, -0.9884F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-2.7F, 0.7059F, 15.5822F, 0.7459F, 0.158F, -0.5295F));

		PartDefinition cube_r3 = hips.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(88, 83).mirror().addBox(-0.1F, -1.2026F, -0.1299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5059F, 14.2822F, -1.0123F, 0.0F, -0.48F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(69, 83).mirror().addBox(-0.1206F, -0.2914F, -0.6148F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.8F, 1.8059F, 12.0822F, -0.1021F, 0.0235F, -0.2543F));

		PartDefinition cube_r5 = hips.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(91, 53).mirror().addBox(-0.1F, 0.5859F, -1.3856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.5059F, 14.2822F, -0.6981F, 0.0F, -0.48F));

		PartDefinition cube_r6 = hips.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(91, 49).mirror().addBox(-3.0F, -0.0677F, -0.9598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 49).addBox(2.0F, -0.0677F, -0.9598F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.1264F, 12.642F, 0.5411F, 0.0F, 0.0F));

		PartDefinition cube_r7 = hips.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 75).mirror().addBox(-1.0F, 0.6709F, -1.3511F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9264F, 16.642F, 0.3316F, -0.2618F, 0.0F));

		PartDefinition cube_r8 = hips.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 57).mirror().addBox(-1.0F, -0.2677F, 0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -1.9264F, 16.642F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r9 = hips.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(37, 75).addBox(0.0F, 0.6709F, -1.3511F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.0F, -1.9264F, 16.642F, 0.3316F, 0.2618F, 0.0F));

		PartDefinition cube_r10 = hips.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(82, 57).addBox(0.0F, -0.2677F, 0.0402F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.9264F, 16.642F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r11 = hips.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 89).addBox(-1.0F, -0.6661F, -0.012F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, 0.7059F, 15.5822F, 0.327F, -0.158F, 0.5295F));

		PartDefinition cube_r12 = hips.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(37, 86).addBox(-1.0F, -0.4061F, -0.9884F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(2.7F, 0.7059F, 15.5822F, 0.7459F, -0.158F, 0.5295F));

		PartDefinition cube_r13 = hips.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(88, 83).addBox(-0.9F, -1.2026F, -0.1299F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.5059F, 14.2822F, -1.0123F, 0.0F, 0.48F));

		PartDefinition cube_r14 = hips.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(69, 83).addBox(-0.8794F, -0.2914F, -0.6148F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(1.8F, 1.8059F, 12.0822F, -0.1021F, -0.0235F, 0.2543F));

		PartDefinition cube_r15 = hips.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(91, 53).addBox(-0.9F, 0.5859F, -1.3856F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(2.5F, 0.5059F, 14.2822F, -0.6981F, 0.0F, 0.48F));

		PartDefinition cube_r16 = hips.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(71, 91).addBox(0.0F, -1.4F, 1.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 93).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.122F, 16.1977F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = hips.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 91).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.2346F, 14.1909F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r18 = hips.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 84).addBox(0.0F, -2.6F, 23.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0015F, -11.7364F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, 0.5345F, 14.7008F, -0.7571F, -0.5843F, -0.2297F));

		PartDefinition cube_r19 = leftLeg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(81, 83).addBox(-2.0F, 0.0F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(74, 83).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7632F, 2.114F, -0.6811F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(79, 25).addBox(-2.0F, -0.7019F, -0.0695F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2632F, 6.014F, 0.2189F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(89, 70).addBox(-2.0F, -1.9F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(56, 89).addBox(-2.0F, -1.9F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.7632F, 2.014F, -0.6811F, 0.0349F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(0, 90).addBox(-2.2F, 1.9683F, 0.1539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F))
				.texOffs(32, 86).addBox(-0.6F, 0.7683F, 0.2539F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(81, 89).addBox(-2.2F, 4.9683F, -0.3461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(81, 13).addBox(-2.2F, -0.0317F, -0.8461F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.5632F, 7.1013F, 1.4947F, 1.6581F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create().texOffs(83, 8).addBox(-2.0F, -0.1142F, -0.7461F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.606F, 5.9067F, 1.1317F, -0.6545F, 0.0F, 0.0F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create().texOffs(21, 59).addBox(-3.0F, -0.683F, -4.8758F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0758F, 1.7683F, -0.0054F, 0.1396F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, 0.5345F, 14.7008F, -0.0308F, 0.1006F, 0.0614F));

		PartDefinition cube_r22 = rightLeg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(81, 83).mirror().addBox(0.0F, 0.0F, 0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(74, 83).mirror().addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.7632F, 2.114F, -0.6811F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r23 = rightLeg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(79, 25).mirror().addBox(-1.0F, -0.7019F, -0.0695F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2632F, 6.014F, 0.2189F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r24 = rightLeg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(89, 70).mirror().addBox(0.0F, -1.9F, 0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(56, 89).mirror().addBox(0.0F, -1.9F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.7632F, 2.014F, -0.6811F, 0.0349F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(0, 90).mirror().addBox(1.2F, 1.9683F, 0.1539F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(32, 86).mirror().addBox(-0.4F, 0.7683F, 0.2539F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 89).mirror().addBox(1.2F, 4.9683F, -0.3461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(81, 13).mirror().addBox(1.2F, -0.0317F, -0.8461F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.5632F, 7.1013F, 1.4947F, 1.4399F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create().texOffs(83, 8).mirror().addBox(-1.0F, -0.1142F, -0.7461F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.606F, 5.9067F, 1.1317F, -0.6545F, 0.0F, 0.0F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create().texOffs(21, 59).mirror().addBox(-2.0F, -0.683F, -4.8758F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0758F, 1.7683F, -0.0054F, -0.2967F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 38).addBox(-1.0F, -0.6389F, -0.2122F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.5525F, 19.6895F, -0.2288F, -0.1275F, 0.0296F));

		PartDefinition cube_r25 = tail1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(95, 34).addBox(0.0F, -1.4F, 10.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 62).addBox(0.0F, -1.4F, 8.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 94).addBox(0.0F, -1.4F, 6.8F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(10, 92).addBox(0.0F, -1.4F, 4.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(92, 0).addBox(0.0F, -1.4F, 2.8F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5696F, -2.9918F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r26 = tail1.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(22, 96).addBox(0.0F, 2.7025F, 6.1215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 87).addBox(0.0F, 2.4025F, 4.1215F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 93).addBox(0.0F, 0.9025F, 2.1215F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(50, 93).addBox(0.0F, 0.1025F, 0.1215F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3304F, 1.6082F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 19).addBox(-0.5F, -0.2448F, -0.1652F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.4632F, 9.7223F, 0.3058F, -0.1625F, -0.2254F));

		PartDefinition cube_r27 = tail2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(96, 59).addBox(0.0F, -0.9F, 19.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 52).addBox(0.0F, -0.9F, 17.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 96).addBox(0.0F, -0.9F, 15.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 96).addBox(0.0F, -0.9F, 13.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(34, 96).addBox(0.0F, -0.9F, 11.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(31, 96).addBox(0.0F, -0.9F, 9.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6374F, -9.1363F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r28 = tail2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(8, 97).addBox(0.0F, 1.3F, 5.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 56).addBox(0.0F, 0.9F, 3.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 83).addBox(0.0F, 0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(5, 94).addBox(0.0F, -0.7F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0188F, 1.0873F, 0.3403F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(45, 0).addBox(-0.5F, -0.5032F, -0.0566F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.265F, 11.7962F, 0.2434F, -0.5969F, -0.1387F));

		PartDefinition cube_r29 = tail3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(77, 96).addBox(0.0F, -0.9F, 26.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 96).addBox(0.0F, -0.9F, 24.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(96, 70).addBox(0.0F, -0.9F, 22.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 96).addBox(0.0F, -0.9F, 20.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 96).addBox(0.0F, -0.9F, 18.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8958F, -18.0276F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5306F, 10.69F, 0.0443F, -0.1744F, -0.0077F));

		PartDefinition cube_r30 = body.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(49, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8779F, -2.3164F, -0.0037F, 0.1202F, -0.6121F));

		PartDefinition cube_r31 = body.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(77, 42).mirror().addBox(-3.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8779F, -2.3164F, -0.1213F, 0.0778F, -1.6287F));

		PartDefinition cube_r32 = body.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(90, 32).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.8779F, -2.3164F, -0.0639F, 0.1291F, -1.087F));

		PartDefinition cube_r33 = body.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(91, 47).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9779F, -4.3164F, -0.0037F, 0.1202F, -0.5423F));

		PartDefinition cube_r34 = body.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(91, 57).mirror().addBox(-4.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9779F, -4.3164F, -0.1213F, 0.0778F, -1.5588F));

		PartDefinition cube_r35 = body.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(90, 30).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.9779F, -4.3164F, -0.0639F, 0.1291F, -1.0172F));

		PartDefinition cube_r36 = body.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0779F, -6.3164F, -0.0037F, 0.1202F, -0.4725F));

		PartDefinition cube_r37 = body.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(83, 75).mirror().addBox(-5.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0779F, -6.3164F, -0.1213F, 0.0778F, -1.489F));

		PartDefinition cube_r38 = body.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(90, 28).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0779F, -6.3164F, -0.0639F, 0.1291F, -0.9474F));

		PartDefinition cube_r39 = body.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(91, 43).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.2779F, -8.3164F, -0.0037F, 0.1202F, -0.4376F));

		PartDefinition cube_r40 = body.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(78, 73).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.2779F, -8.3164F, -0.1213F, 0.0778F, -1.4541F));

		PartDefinition cube_r41 = body.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(90, 26).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.2779F, -8.3164F, -0.0639F, 0.1291F, -0.9125F));

		PartDefinition cube_r42 = body.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(42, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4779F, -10.3164F, 0.0379F, 0.1344F, -0.3101F));

		PartDefinition cube_r43 = body.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(77, 40).mirror().addBox(-7.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4779F, -10.3164F, -0.1116F, 0.1204F, -1.331F));

		PartDefinition cube_r44 = body.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(90, 24).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4779F, -10.3164F, -0.0334F, 0.1606F, -0.7859F));

		PartDefinition cube_r45 = body.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(91, 41).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5779F, -12.3164F, 0.0379F, 0.1344F, -0.2752F));

		PartDefinition cube_r46 = body.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(90, 22).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5779F, -12.3164F, -0.0334F, 0.1606F, -0.751F));

		PartDefinition cube_r47 = body.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 73).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.5779F, -12.3164F, -0.1116F, 0.1204F, -1.2961F));

		PartDefinition cube_r48 = body.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(70, 6).mirror().addBox(-9.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7779F, -14.3164F, -0.092F, 0.2055F, -1.2929F));

		PartDefinition cube_r49 = body.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(90, 20).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7779F, -14.3164F, 0.0287F, 0.2231F, -0.7391F));

		PartDefinition cube_r50 = body.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(24, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.7779F, -14.3164F, 0.1216F, 0.162F, -0.2628F));

		PartDefinition cube_r51 = body.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(90, 32).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.8779F, -2.3164F, -0.0639F, -0.1291F, 1.087F));

		PartDefinition cube_r52 = body.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(77, 42).addBox(2.2446F, -1.8776F, -0.5238F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.8779F, -2.3164F, -0.1213F, -0.0778F, 1.6287F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(49, 91).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.8779F, -2.3164F, -0.0037F, -0.1202F, 0.6121F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(90, 30).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9779F, -4.3164F, -0.0639F, -0.1291F, 1.0172F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(91, 57).addBox(2.2446F, -1.8776F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9779F, -4.3164F, -0.1213F, -0.0778F, 1.5588F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(91, 47).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.9779F, -4.3164F, -0.0037F, -0.1202F, 0.5423F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(90, 28).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0779F, -6.3164F, -0.0639F, -0.1291F, 0.9474F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(83, 75).addBox(2.2446F, -1.8776F, -0.5238F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0779F, -6.3164F, -0.1213F, -0.0778F, 1.489F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(91, 45).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0779F, -6.3164F, -0.0037F, -0.1202F, 0.4725F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(90, 26).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.2779F, -8.3164F, -0.0639F, -0.1291F, 0.9125F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(78, 73).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.2779F, -8.3164F, -0.1213F, -0.0778F, 1.4541F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(91, 43).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.2779F, -8.3164F, -0.0037F, -0.1202F, 0.4376F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(90, 24).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.4779F, -10.3164F, -0.0334F, -0.1606F, 0.7859F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(77, 40).addBox(2.2446F, -1.8776F, -0.5238F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.4779F, -10.3164F, -0.1116F, -0.1204F, 1.331F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(42, 91).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.4779F, -10.3164F, 0.0379F, -0.1344F, 0.3101F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(63, 73).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5779F, -12.3164F, -0.1116F, -0.1204F, 1.2961F));

		PartDefinition cube_r67 = body.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(90, 22).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5779F, -12.3164F, -0.0334F, -0.1606F, 0.751F));

		PartDefinition cube_r68 = body.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(91, 41).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.5779F, -12.3164F, 0.0379F, -0.1344F, 0.2752F));

		PartDefinition cube_r69 = body.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(24, 91).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.7779F, -14.3164F, 0.1216F, -0.162F, 0.2628F));

		PartDefinition cube_r70 = body.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(90, 20).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.7779F, -14.3164F, 0.0287F, -0.2231F, 0.7391F));

		PartDefinition cube_r71 = body.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(70, 6).addBox(2.2446F, -1.8776F, -0.5238F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.7779F, -14.3164F, -0.092F, -0.2055F, 1.2929F));

		PartDefinition cube_r72 = body.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.3833F, -15.9528F, 8.0F, 4.0F, 14.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 8.9819F, 1.4026F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r73 = body.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -1.5824F, 8.8646F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 3.2819F, -24.5974F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r74 = body.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(19, 93).addBox(0.0F, -2.7F, 21.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(21, 51).addBox(0.0F, -2.7F, 19.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 93).addBox(0.0F, -2.7F, 17.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(44, 81).addBox(0.0F, -2.7F, 15.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 93).addBox(0.0F, -2.7F, 13.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(13, 92).addBox(0.0F, -2.7F, 11.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 13).addBox(0.0F, -2.7F, 9.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(25, 96).addBox(0.0F, -2.4F, 7.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5509F, -22.4259F, 0.0436F, 0.0F, 0.0F));

		PartDefinition chest = body.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3559F, -15.7262F, 0.0233F, -0.13F, -0.0463F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-0.0433F, -1.3269F, -0.0889F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 8.4248F, -6.3978F, -0.2576F, -0.0581F, -0.8378F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(34, 66).mirror().addBox(0.0F, 0.0476F, -0.3111F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.1248F, -6.4978F, 0.1613F, -0.0581F, -0.8378F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(0, 84).mirror().addBox(0.0F, -2.7057F, -2.1658F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.1248F, -6.4978F, -0.9076F, 0.0F, 0.0698F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(11, 81).mirror().addBox(0.0F, -6.1363F, -0.332F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.1248F, -6.4978F, -0.3491F, 0.0F, 0.0698F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(57, 80).mirror().addBox(0.0F, -5.8534F, -0.3103F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 7.1248F, -6.4978F, -0.1745F, 0.0F, 0.0698F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(48, 80).mirror().addBox(-0.0061F, -2.936F, -2.0512F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.6353F, 1.9972F, -3.8457F, -0.3586F, 0.0776F, 0.2739F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(17, 91).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.2477F, -8.3143F, 0.573F, 0.3018F, -0.4749F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(90, 18).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.2477F, -8.3143F, 0.3862F, 0.5452F, -0.9199F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(-6.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 2.2477F, -8.3143F, 0.0113F, 0.6566F, -1.5664F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(90, 77).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4477F, -4.2143F, 0.4297F, 0.2272F, -0.2681F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(90, 12).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4477F, -4.2143F, 0.2823F, 0.4179F, -0.7238F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(72, 65).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.4477F, -4.2143F, 0.0105F, 0.4995F, -1.3224F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(63, 71).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.8477F, -6.2143F, 0.011F, 0.5868F, -1.4095F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(10, 90).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.8477F, -6.2143F, 0.3383F, 0.4892F, -0.7865F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(90, 39).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.8477F, -6.2143F, 0.5086F, 0.2693F, -0.336F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(72, 69).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.7477F, -0.5143F, -0.0105F, 0.3102F, -1.2947F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(72, 67).mirror().addBox(-8.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0477F, -2.2143F, -0.0003F, 0.3787F, -1.2917F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(90, 14).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0477F, -2.2143F, 0.2018F, 0.3226F, -0.7177F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(90, 16).mirror().addBox(-2.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.7477F, -0.5143F, 0.1549F, 0.2701F, -0.7309F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(90, 81).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 0.7477F, -0.5143F, 0.2535F, 0.1482F, -0.265F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(90, 79).mirror().addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.4F, 1.0477F, -2.2143F, 0.318F, 0.1751F, -0.2551F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(72, 69).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.7477F, -0.5143F, -0.0105F, -0.3102F, 1.2947F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(90, 16).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.7477F, -0.5143F, 0.1549F, -0.2701F, 0.7309F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(90, 81).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.7477F, -0.5143F, 0.2535F, -0.1482F, 0.265F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(72, 67).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0477F, -2.2143F, -0.0003F, -0.3787F, 1.2917F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(90, 14).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0477F, -2.2143F, 0.2018F, -0.3226F, 0.7177F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(90, 79).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.0477F, -2.2143F, 0.318F, -0.1751F, 0.2551F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(72, 65).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.4477F, -4.2143F, 0.0105F, -0.4995F, 1.3224F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(90, 12).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.4477F, -4.2143F, 0.2823F, -0.4179F, 0.7238F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(90, 77).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.4477F, -4.2143F, 0.4297F, -0.2272F, 0.2681F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(78, 71).addBox(2.2446F, -1.8776F, -0.5238F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.2477F, -8.3143F, 0.0113F, -0.6566F, 1.5664F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(90, 18).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.2477F, -8.3143F, 0.3862F, -0.5452F, 0.9199F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(17, 91).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 2.2477F, -8.3143F, 0.573F, -0.3018F, 0.4749F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(90, 39).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.8477F, -6.2143F, 0.5086F, -0.2693F, 0.336F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(10, 90).addBox(0.891F, -0.4534F, -0.5238F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.8477F, -6.2143F, 0.3383F, -0.4892F, 0.7865F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(63, 71).addBox(2.2446F, -1.8776F, -0.5238F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 1.8477F, -6.2143F, 0.011F, -0.5868F, 1.4095F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(11, 81).addBox(-1.0F, -6.1363F, -0.332F, 1.0F, 6.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(5.0F, 7.1248F, -6.4978F, -0.3491F, 0.0F, -0.0698F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(0, 84).addBox(-1.0F, -2.7057F, -2.1658F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 7.1248F, -6.4978F, -0.9076F, 0.0F, -0.0698F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(64, 35).addBox(-0.9567F, -1.3269F, -0.0889F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(3.5F, 8.4248F, -6.3978F, -0.2576F, 0.0581F, 0.8378F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(34, 66).addBox(-1.0F, 0.0476F, -0.3111F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 7.1248F, -6.4978F, 0.1613F, 0.0581F, 0.8378F));

		PartDefinition cube_r115 = chest.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(57, 80).addBox(-1.0F, -5.8534F, -0.3103F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(5.0F, 7.1248F, -6.4978F, -0.1745F, 0.0F, -0.0698F));

		PartDefinition cube_r116 = chest.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(48, 80).addBox(-0.9939F, -2.936F, -2.0512F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.6353F, 1.9972F, -3.8457F, -0.3586F, -0.0776F, -0.2739F));

		PartDefinition cube_r117 = chest.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(37, 33).addBox(-1.0F, -0.5649F, -0.7235F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 1.8517F, -9.0953F, 0.2007F, 0.0F, 0.0F));

		PartDefinition cube_r118 = chest.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(94, 93).addBox(0.0F, -2.2203F, 5.8815F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 96).addBox(0.0F, -1.8203F, 3.8815F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(94, 66).addBox(0.0F, -1.4203F, 1.8815F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(65, 94).addBox(0.0F, -1.1203F, -0.1185F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1207F, -6.9238F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r119 = chest.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(91, 93).addBox(0.0F, -1.8306F, 0.0201F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2207F, -8.9238F, -0.096F, 0.0F, 0.0F));

		PartDefinition armL = chest.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.3069F, 8.0157F, -4.4103F, 0.1438F, 0.514F, 0.1615F));

		PartDefinition cube_r120 = armL.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 20).addBox(-2.2766F, -1.3284F, 0.2729F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.5934F, 0.6109F));

		PartDefinition cube_r121 = armL.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 79).addBox(-2.3076F, -1.3284F, -0.2014F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(79, 30).addBox(-2.3076F, -1.3284F, 4.7986F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
				.texOffs(70, 59).addBox(-1.8076F, -1.3284F, 1.7986F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.0F, 0.6109F));

		PartDefinition armL2 = armL.addOrReplaceChild("armL2", CubeListBuilder.create().texOffs(27, 82).addBox(-1.0F, 0.0F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.05F))
				.texOffs(64, 80).addBox(-1.0F, 0.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.5902F, 0.0425F, 6.3242F, 0.4411F, 0.1613F, 0.0301F));

		PartDefinition armL3 = armL2.addOrReplaceChild("armL3", CubeListBuilder.create().texOffs(48, 58).addBox(-2.75F, 0.0F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1303F, 5.8919F, 0.8577F, 0.0178F, -1.1083F, 0.4905F));

		PartDefinition armL4 = chest.addOrReplaceChild("armL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.3069F, 8.0157F, -4.4103F, -0.3701F, -0.8033F, -0.0362F));

		PartDefinition cube_r122 = armL4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(79, 20).mirror().addBox(-0.7234F, -1.3284F, 0.2729F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, -0.5934F, -0.6109F));

		PartDefinition cube_r123 = armL4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 79).mirror().addBox(-0.6924F, -1.3284F, -0.2014F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(79, 30).mirror().addBox(-0.6924F, -1.3284F, 4.7986F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(70, 59).mirror().addBox(-0.1924F, -1.3284F, 1.7986F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.781F, -0.1732F, 0.0F, 0.0F, -0.6109F));

		PartDefinition armL5 = armL4.addOrReplaceChild("armL5", CubeListBuilder.create().texOffs(27, 82).mirror().addBox(0.0F, 0.0F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.05F)).mirror(false)
				.texOffs(64, 80).mirror().addBox(0.0F, 0.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.5902F, 0.0425F, 6.3242F, 0.4411F, -0.1613F, -0.0301F));

		PartDefinition armL6 = armL5.addOrReplaceChild("armL6", CubeListBuilder.create().texOffs(48, 58).mirror().addBox(-2.25F, 0.0F, -4.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.1303F, 5.8919F, 0.8577F, 0.24F, 1.1038F, 0.0001F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2258F, -9.1835F, -0.0984F, -0.4301F, 0.0234F));

		PartDefinition cube_r124 = neck1.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(48, 47).addBox(-1.0F, -0.6215F, -3.5645F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2399F, -4.3419F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r125 = neck1.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(93, 83).addBox(0.0F, -1.7904F, -1.6761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 93).addBox(0.0F, -2.1904F, 2.3239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 93).addBox(0.0F, -1.9904F, 0.3239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(32, 82).addBox(0.0F, -1.5904F, -3.6761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2399F, -4.2419F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Neck_r1 = neck1.addOrReplaceChild("Neck_r1", CubeListBuilder.create().texOffs(95, 4).mirror().addBox(-0.0081F, -0.0222F, -0.5394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6866F, -7.6781F, 1.1876F, -0.2959F, 0.082F));

		PartDefinition Neck_r2 = neck1.addOrReplaceChild("Neck_r2", CubeListBuilder.create().texOffs(74, 93).mirror().addBox(-0.1123F, 0.0382F, -0.2278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 1.2574F, -1.7895F, 1.1192F, -0.3838F, 0.2002F));

		PartDefinition Neck_r3 = neck1.addOrReplaceChild("Neck_r3", CubeListBuilder.create().texOffs(59, 93).mirror().addBox(-0.1114F, -0.2522F, -0.5824F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6574F, -3.5895F, 1.0422F, -0.3759F, 0.1763F));

		PartDefinition Neck_r4 = neck1.addOrReplaceChild("Neck_r4", CubeListBuilder.create().texOffs(0, 95).mirror().addBox(-0.1228F, -0.2493F, -0.7001F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.6866F, -5.3781F, 0.9185F, -0.21F, 0.3188F));

		PartDefinition Neck_r5 = neck1.addOrReplaceChild("Neck_r5", CubeListBuilder.create().texOffs(74, 93).addBox(0.1123F, 0.0382F, -0.2278F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.2574F, -1.7895F, 1.1192F, 0.3838F, -0.2002F));

		PartDefinition Neck_r6 = neck1.addOrReplaceChild("Neck_r6", CubeListBuilder.create().texOffs(59, 93).addBox(0.1114F, -0.2522F, -0.5824F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6574F, -3.5895F, 1.0422F, 0.3759F, -0.1763F));

		PartDefinition Neck_r7 = neck1.addOrReplaceChild("Neck_r7", CubeListBuilder.create().texOffs(95, 4).addBox(0.0081F, -0.0222F, -0.5394F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6866F, -7.6781F, 1.1876F, 0.2959F, -0.082F));

		PartDefinition Neck_r8 = neck1.addOrReplaceChild("Neck_r8", CubeListBuilder.create().texOffs(0, 95).addBox(0.1228F, -0.2493F, -0.7001F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6866F, -5.3781F, 0.9185F, 0.21F, -0.3188F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1622F, -7.7403F, 0.2778F, -0.3367F, -0.0939F));

		PartDefinition cube_r126 = neck2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(88, 93).addBox(0.0F, -1.5904F, -2.3761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(95, 0).addBox(0.0F, -1.3904F, -4.3761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 68).addBox(-1.0F, -0.5904F, -4.3761F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -0.5F, 0.5F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r127 = neck2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(96, 49).addBox(0.0F, -0.3784F, -1.8883F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 46).addBox(-1.0F, 0.2216F, -1.8883F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.7F, -3.9F, 0.3491F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 59).addBox(1.0F, -2.1488F, -1.6585F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F))
				.texOffs(42, 59).mirror().addBox(-3.0F, -2.1488F, -1.6585F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false)
				.texOffs(13, 71).addBox(-3.0F, -1.4488F, -5.6585F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8645F, -5.1168F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(32, 93).mirror().addBox(-0.5F, -0.0216F, 0.0761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 93).addBox(4.3F, -0.0216F, 0.0761F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9F, -2.7488F, -5.1585F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(77, 35).mirror().addBox(0.0F, -0.0216F, -2.9239F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -2.7488F, -5.1585F, 0.6699F, -0.6227F, -0.3825F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(88, 35).mirror().addBox(0.1F, 0.0465F, 0.0935F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, -3.1488F, -4.2585F, -0.2473F, 0.1524F, -0.0383F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(87, 66).mirror().addBox(-3.0F, -0.0397F, -2.154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(87, 66).addBox(1.2F, -0.0397F, -2.154F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.8946F, -1.2125F, -1.693F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(87, 62).mirror().addBox(-3.0F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(87, 62).addBox(1.2F, -0.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1F, -0.1054F, -1.0125F, -2.1293F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(27, 93).mirror().addBox(-3.02F, -0.0199F, 0.0629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(27, 93).addBox(1.02F, -0.0199F, 0.0629F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.8488F, -5.0585F, 0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r134 = head.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(64, 44).mirror().addBox(-3.02F, 0.017F, 0.034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(64, 44).addBox(1.02F, 0.017F, 0.034F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.3488F, -4.1585F, -0.384F, 0.0F, 0.0F));

		PartDefinition cube_r135 = head.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(37, 93).mirror().addBox(-3.03F, 0.5833F, -0.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(5, 90).mirror().addBox(-3.02F, -0.0167F, 0.0497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(42, 93).mirror().addBox(-3.23F, 0.5833F, -0.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(42, 93).addBox(1.23F, 0.5833F, -0.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(37, 93).addBox(1.03F, 0.5833F, -0.1503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(5, 90).addBox(1.02F, -0.0167F, 0.0497F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -1.9488F, -3.2585F, -1.3439F, 0.0F, 0.0F));

		PartDefinition cube_r136 = head.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(91, 59).mirror().addBox(-3.02F, -1.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(91, 59).addBox(1.02F, -1.3F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0488F, -4.0585F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r137 = head.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(82, 62).mirror().addBox(-1.6F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(13, 68).mirror().addBox(-1.6F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.4363F, -8.7602F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r138 = head.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(74, 89).mirror().addBox(0.08F, -1.742F, -0.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9649F, -5.919F, -2.9583F, -0.1396F, 0.0F));

		PartDefinition cube_r139 = head.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(42, 87).mirror().addBox(0.08F, -0.1672F, -0.4816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9649F, -5.919F, -1.3963F, -0.1396F, 0.0F));

		PartDefinition cube_r140 = head.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(49, 87).mirror().addBox(0.08F, -0.1242F, 0.2998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9649F, -5.919F, -2.2689F, -0.1396F, 0.0F));

		PartDefinition cube_r141 = head.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(70, 78).mirror().addBox(0.0F, -0.9947F, 0.0211F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 1.5612F, -9.6585F, -0.0554F, -0.3311F, 0.018F));

		PartDefinition cube_r142 = head.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(69, 51).mirror().addBox(0.1F, 0.8184F, -3.3976F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9649F, -5.919F, 0.1658F, -0.1396F, 0.0F));

		PartDefinition cube_r143 = head.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(64, 20).mirror().addBox(0.1F, -0.738F, -3.5132F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-2.1F, -0.9649F, -5.919F, 0.6021F, -0.1396F, 0.0F));

		PartDefinition cube_r144 = head.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(69, 51).addBox(-1.1F, 0.8184F, -3.3976F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(1.1F, -0.9649F, -5.919F, 0.1658F, 0.1396F, 0.0F));

		PartDefinition cube_r145 = head.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(64, 20).addBox(-1.1F, -0.738F, -3.5132F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -0.9649F, -5.919F, 0.6021F, 0.1396F, 0.0F));

		PartDefinition cube_r146 = head.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(70, 75).addBox(-2.5F, 0.0635F, -0.0234F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -4.4295F, 1.5655F, -2.1118F, 0.0F, 0.0F));

		PartDefinition cube_r147 = head.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(0, 75).addBox(-3.0F, -0.0132F, 0.0067F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, -2.7295F, 2.4655F, -2.6704F, 0.0F, 0.0F));

		PartDefinition cube_r148 = head.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(50, 71).addBox(-3.0F, -0.0718F, -0.0234F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -0.8295F, 2.0655F, 2.9496F, 0.0F, 0.0F));

		PartDefinition cube_r149 = head.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(64, 13).addBox(-3.0F, -2.4F, -2.8F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -2.5295F, -1.1345F, -2.9322F, 0.0F, 0.0F));

		PartDefinition cube_r150 = head.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(42, 65).addBox(-2.5F, -2.0592F, -0.017F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, -6.9388F, -2.9585F, -1.6319F, 0.0F, 0.0F));

		PartDefinition cube_r151 = head.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(64, 28).addBox(-2.5F, -3.0568F, 0.0053F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.8388F, -0.9585F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r152 = head.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(19, 66).addBox(-2.5F, -1.044F, -0.0078F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -6.5388F, -3.8585F, -1.1432F, 0.0F, 0.0F));

		PartDefinition cube_r153 = head.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(45, 13).addBox(-2.5F, -1.9845F, 0.0603F, 4.0F, 2.0F, 3.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -4.9388F, -4.9585F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r154 = head.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 51).addBox(-2.5F, -2.1F, -2.7F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -2.5801F, -1.8911F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r155 = head.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(48, 75).addBox(-2.5F, -1.6086F, -0.0499F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, -3.3388F, -5.2585F, -0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r156 = head.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(13, 76).addBox(-1.5F, -0.0257F, -0.666F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -2.7388F, -5.8585F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r157 = head.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(22, 93).addBox(-1.0F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -0.3587F, -8.5017F, 1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r158 = head.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(92, 74).addBox(-1.5F, -0.0603F, -0.9952F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -1.4388F, -8.1585F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r159 = head.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(18, 87).addBox(-1.5F, 0.0034F, -1.9454F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.5F, -2.3388F, -6.4585F, 0.4538F, 0.0F, 0.0F));

		PartDefinition cube_r160 = head.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(70, 0).addBox(-1.5F, -0.0276F, 0.0145F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.0F, -0.3388F, -9.1585F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r161 = head.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(92, 8).addBox(-1.0F, 0.0311F, 0.0127F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, 0.4612F, -9.7585F, 0.9861F, 0.0F, 0.0F));

		PartDefinition cube_r162 = head.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(70, 8).addBox(-1.5F, -0.8424F, -0.1959F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9612F, -6.7585F, 0.1222F, 0.0F, 0.0F));

		PartDefinition cube_r163 = head.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(24, 77).addBox(-1.5F, -0.7944F, 0.0106F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7612F, -9.6585F, -0.0554F, 0.3311F, -0.018F));

		PartDefinition cube_r164 = head.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(70, 78).addBox(-2.0F, -0.9947F, 0.0211F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.5612F, -9.6585F, -0.0554F, 0.3311F, -0.018F));

		PartDefinition cube_r165 = head.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(59, 75).addBox(-1.5F, -1.0374F, -2.9853F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.7612F, -6.6585F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r166 = head.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(37, 71).addBox(-2.5F, -1.0F, -3.2F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4612F, -3.6585F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r167 = head.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(77, 93).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4612F, -9.6585F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r168 = head.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(74, 89).addBox(-1.08F, -1.742F, -0.1539F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.1F, -0.9649F, -5.919F, -2.9583F, 0.1396F, 0.0F));

		PartDefinition cube_r169 = head.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(49, 87).addBox(-1.08F, -0.1242F, 0.2998F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.9649F, -5.919F, -2.2689F, 0.1396F, 0.0F));

		PartDefinition cube_r170 = head.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(82, 62).addBox(0.6F, -0.3F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(13, 68).addBox(0.6F, -0.3F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9F, 0.4363F, -8.7602F, -2.1991F, 0.0F, 0.0F));

		PartDefinition cube_r171 = head.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(42, 87).addBox(-1.08F, -0.1672F, -0.4816F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.1F, -0.9649F, -5.919F, -1.3963F, 0.1396F, 0.0F));

		PartDefinition cube_r172 = head.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(57, 65).addBox(-3.0F, -3.01F, -2.8F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.5612F, -0.7585F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r173 = head.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(88, 35).addBox(-1.1F, 0.0465F, 0.0935F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -3.1488F, -4.2585F, -0.2473F, -0.1524F, 0.0383F));

		PartDefinition cube_r174 = head.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(77, 35).addBox(-2.0F, -0.0216F, -2.9239F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -2.7488F, -5.1585F, 0.6699F, 0.6227F, 0.3825F));

		PartDefinition cube_r175 = head.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(0, 60).addBox(-3.0F, -2.9892F, -0.0387F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.0F, 1.5612F, -4.6585F, 0.2094F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(87, 5).addBox(-1.5F, -0.2043F, -8.7061F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 1.9004F, -0.9289F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r176 = jaw.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(82, 52).mirror().addBox(0.0F, -1.6346F, -3.1397F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(82, 42).mirror().addBox(0.0F, -1.3816F, -2.8424F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.1957F, -5.5061F, -0.0175F, -0.3491F, 0.0F));

		PartDefinition cube_r177 = jaw.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(82, 47).mirror().addBox(-2.0F, -0.1889F, -2.4132F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false)
				.texOffs(82, 47).addBox(1.0F, -0.1889F, -2.4132F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.5F, -0.3043F, -3.2061F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r178 = jaw.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(81, 78).mirror().addBox(-2.0F, -0.0203F, -3.0124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(81, 78).addBox(1.0F, -0.0203F, -3.0124F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.5F, -0.3043F, -2.6061F, 0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r179 = jaw.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(18, 82).mirror().addBox(0.0F, -1.0152F, -2.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 1.1957F, -5.5061F, -0.1396F, -0.3491F, 0.0F));

		PartDefinition cube_r180 = jaw.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(35, 81).addBox(1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 1.4957F, -2.5061F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r181 = jaw.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(88, 89).mirror().addBox(-0.5F, -0.0631F, -1.9579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.0957F, -0.7061F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r182 = jaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-3.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(83, 0).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 1.4957F, -2.5061F, 0.2094F, 0.0F, 0.0F));

		PartDefinition cube_r183 = jaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(82, 52).addBox(-1.0F, -1.6346F, -3.1397F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(82, 42).addBox(-1.0F, -1.3816F, -2.8424F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 1.1957F, -5.5061F, -0.0175F, 0.3491F, 0.0F));

		PartDefinition cube_r184 = jaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(18, 82).addBox(-1.0F, -1.0152F, -2.9851F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.5F, 1.1957F, -5.5061F, -0.1396F, 0.3491F, 0.0F));

		PartDefinition cube_r185 = jaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(88, 89).addBox(-0.5F, -0.0631F, -1.9579F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.0957F, -0.7061F, -0.1833F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 100, 100);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}