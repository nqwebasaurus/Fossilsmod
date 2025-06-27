package fossils.fossils.client.blockentity.model.ruhuhucerberus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class RuhuhucerberusFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart bone2;
	private final ModelPart bone8;
	private final ModelPart leftLeg;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart leftArm6;
	private final ModelPart rightLeg;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart rightArm6;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart bodyfront;
	private final ModelPart chest;
	private final ModelPart bone;
	private final ModelPart bone7;
	private final ModelPart leftarm;
	private final ModelPart leftarm2;
	private final ModelPart leftArm3;
	private final ModelPart leftArm4;
	private final ModelPart leftArm5;
	private final ModelPart rightarm;
	private final ModelPart rightarm2;
	private final ModelPart rightArm3;
	private final ModelPart rightArm4;
	private final ModelPart rightArm5;
	private final ModelPart neck;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart lowerjaw1;
	private final ModelPart lowerjaw2;
	private final ModelPart lowerjaw3;
	private final ModelPart lowerjawslope;
	private final ModelPart upperjaw1;
	private final ModelPart upperjaw2;
	private final ModelPart nose;
	private final ModelPart upperjawteeth;
	private final ModelPart bone4;
	private final ModelPart bone6;
	private final ModelPart bone3;
	private final ModelPart bone5;
	private final ModelPart fur1;
	private final ModelPart fur2;
	private final ModelPart fur3;

	public RuhuhucerberusFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.hips = this.root.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.bone2 = this.hips.getChild("bone2");
		this.bone8 = this.hips.getChild("bone8");
		this.leftLeg = this.hips.getChild("leftLeg");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.leftArm6 = this.leftLeg3.getChild("leftArm6");
		this.rightLeg = this.hips.getChild("rightLeg");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.rightArm6 = this.rightLeg3.getChild("rightArm6");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.bodyfront = this.body2.getChild("bodyfront");
		this.chest = this.bodyfront.getChild("chest");
		this.bone = this.chest.getChild("bone");
		this.bone7 = this.chest.getChild("bone7");
		this.leftarm = this.chest.getChild("leftarm");
		this.leftarm2 = this.leftarm.getChild("leftarm2");
		this.leftArm3 = this.leftarm2.getChild("leftArm3");
		this.leftArm4 = this.leftArm3.getChild("leftArm4");
		this.leftArm5 = this.leftArm4.getChild("leftArm5");
		this.rightarm = this.chest.getChild("rightarm");
		this.rightarm2 = this.rightarm.getChild("rightarm2");
		this.rightArm3 = this.rightarm2.getChild("rightArm3");
		this.rightArm4 = this.rightArm3.getChild("rightArm4");
		this.rightArm5 = this.rightArm4.getChild("rightArm5");
		this.neck = this.chest.getChild("neck");
		this.neck4 = this.neck.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.lowerjaw1 = this.head.getChild("lowerjaw1");
		this.lowerjaw2 = this.lowerjaw1.getChild("lowerjaw2");
		this.lowerjaw3 = this.lowerjaw2.getChild("lowerjaw3");
		this.lowerjawslope = this.lowerjaw2.getChild("lowerjawslope");
		this.upperjaw1 = this.head.getChild("upperjaw1");
		this.upperjaw2 = this.upperjaw1.getChild("upperjaw2");
		this.nose = this.upperjaw2.getChild("nose");
		this.upperjawteeth = this.upperjaw2.getChild("upperjawteeth");
		this.bone4 = this.upperjaw1.getChild("bone4");
		this.bone6 = this.upperjaw1.getChild("bone6");
		this.bone3 = this.head.getChild("bone3");
		this.bone5 = this.head.getChild("bone5");
		this.fur1 = this.body.getChild("fur1");
		this.fur2 = this.fur1.getChild("fur2");
		this.fur3 = this.fur2.getChild("fur3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition hips = root.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.1594F, 7.4916F, -0.2032F, 0.0F, 0.0F));

		PartDefinition hips_r1 = hips.addOrReplaceChild("hips_r1", CubeListBuilder.create().texOffs(21, 82).addBox(0.0F, -1.0211F, -0.0058F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3249F, 2.7872F, -0.1484F, 0.0F, 0.0F));

		PartDefinition hips_r2 = hips.addOrReplaceChild("hips_r2", CubeListBuilder.create().texOffs(18, 82).addBox(0.0F, -1.0137F, 0.0041F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1249F, 0.7872F, -0.1309F, 0.0F, 0.0F));

		PartDefinition hips_r3 = hips.addOrReplaceChild("hips_r3", CubeListBuilder.create().texOffs(41, 18).mirror().addBox(-1.5F, 0.4F, 0.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(41, 18).addBox(0.5F, 0.4F, 0.9F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(13, 23).addBox(-0.5F, -0.1F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.1249F, -0.1128F, -0.096F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(22, 35).addBox(-0.5F, -0.559F, 0.0344F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(41, 12).addBox(0.5F, -0.059F, 0.0344F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(41, 12).mirror().addBox(-1.5F, -0.059F, 0.0344F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0251F, 4.5987F, -0.3132F, 0.1246F, -0.0402F));

		PartDefinition tail3_r1 = tail1.addOrReplaceChild("tail3_r1", CubeListBuilder.create().texOffs(69, 81).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.559F, 2.0344F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3_r2 = tail1.addOrReplaceChild("tail3_r2", CubeListBuilder.create().texOffs(66, 81).addBox(0.0F, 0.1488F, -0.1382F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.441F, 1.1344F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail2_r1 = tail1.addOrReplaceChild("tail2_r1", CubeListBuilder.create().texOffs(15, 82).addBox(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.459F, 0.0344F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(26, 29).addBox(-0.5F, -0.492F, -0.0388F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.0982F, 3.015F, -0.1201F, 0.26F, -0.031F));

		PartDefinition tail4_r1 = tail2.addOrReplaceChild("tail4_r1", CubeListBuilder.create().texOffs(6, 82).addBox(0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 2.9612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail3_r3 = tail2.addOrReplaceChild("tail3_r3", CubeListBuilder.create().texOffs(3, 82).addBox(0.0F, -0.6F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.492F, 0.9612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail6_r1 = tail2.addOrReplaceChild("tail6_r1", CubeListBuilder.create().texOffs(23, 49).addBox(0.0F, 2.3488F, 5.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 81).addBox(0.0F, 1.7488F, 3.8618F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5063F, -3.8902F, 0.3927F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.6302F, 0.0376F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.002F))
				.texOffs(81, 81).addBox(0.0F, -0.9302F, 1.0376F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0999F, 3.8015F, -0.2461F, 0.3393F, -0.0834F));

		PartDefinition tail9_r1 = tail3.addOrReplaceChild("tail9_r1", CubeListBuilder.create().texOffs(78, 81).addBox(0.0F, 4.2488F, 11.8618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(75, 81).addBox(0.0F, 3.9488F, 9.8618F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.3708F, -9.656F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone2 = hips.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5305F, 4.6988F, 2.9446F, 0.0F, 0.0F, 0.1309F));

		PartDefinition hips_r4 = bone2.addOrReplaceChild("hips_r4", CubeListBuilder.create().texOffs(73, 4).addBox(-0.5F, -0.275F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.871F, -3.7005F, 0.4F, 0.4276F, 0.0F, 0.0F));

		PartDefinition hips_r5 = bone2.addOrReplaceChild("hips_r5", CubeListBuilder.create().texOffs(50, 0).addBox(-0.575F, -0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.871F, -3.1329F, -0.3029F, 1.4333F, 0.0242F, 0.1729F));

		PartDefinition hips_r6 = bone2.addOrReplaceChild("hips_r6", CubeListBuilder.create().texOffs(60, 75).addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.871F, -3.7005F, 0.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition hips_r7 = bone2.addOrReplaceChild("hips_r7", CubeListBuilder.create().texOffs(52, 6).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.871F, -3.8345F, -0.0841F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r8 = bone2.addOrReplaceChild("hips_r8", CubeListBuilder.create().texOffs(55, 75).addBox(-0.5F, -0.0596F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.871F, -4.6345F, -1.9841F, 0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r9 = bone2.addOrReplaceChild("hips_r9", CubeListBuilder.create().texOffs(50, 12).addBox(-0.5034F, -0.576F, -0.7442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.2248F, -0.6854F, -2.0951F, 1.1924F, -0.1514F, 0.3206F));

		PartDefinition hips_r10 = bone2.addOrReplaceChild("hips_r10", CubeListBuilder.create().texOffs(25, 73).addBox(-0.5F, -0.825F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5969F, -1.883F, -1.668F, 0.6021F, 0.0F, 0.1309F));

		PartDefinition hips_r11 = bone2.addOrReplaceChild("hips_r11", CubeListBuilder.create().texOffs(35, 53).addBox(-0.3218F, -0.3984F, 0.3392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.0F, 0.0F, 0.6458F, 0.0F, 0.3491F));

		PartDefinition hips_r12 = bone2.addOrReplaceChild("hips_r12", CubeListBuilder.create().texOffs(9, 48).addBox(-0.725F, -1.4F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.4792F, -0.7955F, 0.0516F, 0.0012F, -0.0226F, 0.2468F));

		PartDefinition hips_r13 = bone2.addOrReplaceChild("hips_r13", CubeListBuilder.create().texOffs(52, 64).addBox(-0.4758F, -0.3551F, -0.2705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.2248F, -0.6854F, -2.0951F, -0.896F, -0.1451F, 0.3186F));

		PartDefinition hips_r14 = bone2.addOrReplaceChild("hips_r14", CubeListBuilder.create().texOffs(75, 78).addBox(-0.4758F, -0.2672F, -0.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2248F, -0.6854F, -2.0951F, 0.5003F, -0.1451F, 0.3186F));

		PartDefinition hips_r15 = bone2.addOrReplaceChild("hips_r15", CubeListBuilder.create().texOffs(45, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0899F, -0.0563F, 0.0954F, 0.2618F, 0.0F, 0.3491F));

		PartDefinition hips_r16 = bone2.addOrReplaceChild("hips_r16", CubeListBuilder.create().texOffs(78, 39).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.3027F, -1.1349F, 1.3091F, 0.8306F, 0.0594F, 0.3442F));

		PartDefinition hips_r17 = bone2.addOrReplaceChild("hips_r17", CubeListBuilder.create().texOffs(7, 53).addBox(-0.775F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6134F, -1.1642F, 0.0233F, 1.2143F, -0.0305F, 0.2673F));

		PartDefinition hips_r18 = bone2.addOrReplaceChild("hips_r18", CubeListBuilder.create().texOffs(46, 28).addBox(-0.183F, -4.1407F, -1.5738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1658F, 0.0F, 0.1309F));

		PartDefinition bone8 = hips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5305F, 4.6988F, 2.9446F, 0.0F, 0.0F, -0.1309F));

		PartDefinition hips_r19 = bone8.addOrReplaceChild("hips_r19", CubeListBuilder.create().texOffs(73, 4).mirror().addBox(-0.5F, -0.275F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.7005F, 0.4F, 0.4276F, 0.0F, 0.0F));

		PartDefinition hips_r20 = bone8.addOrReplaceChild("hips_r20", CubeListBuilder.create().texOffs(50, 0).mirror().addBox(-0.425F, -0.2F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.1329F, -0.3029F, 1.4333F, -0.0242F, -0.1729F));

		PartDefinition hips_r21 = bone8.addOrReplaceChild("hips_r21", CubeListBuilder.create().texOffs(60, 75).mirror().addBox(-0.5F, -0.6F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.7005F, 0.4F, -0.0524F, 0.0F, 0.0F));

		PartDefinition hips_r22 = bone8.addOrReplaceChild("hips_r22", CubeListBuilder.create().texOffs(52, 6).mirror().addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -3.8345F, -0.0841F, -0.1833F, 0.0F, 0.0F));

		PartDefinition hips_r23 = bone8.addOrReplaceChild("hips_r23", CubeListBuilder.create().texOffs(55, 75).mirror().addBox(-0.5F, -0.0596F, -0.986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.871F, -4.6345F, -1.9841F, 0.1222F, 0.0F, 0.0F));

		PartDefinition hips_r24 = bone8.addOrReplaceChild("hips_r24", CubeListBuilder.create().texOffs(50, 12).mirror().addBox(-0.4965F, -0.576F, -0.7442F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -0.6854F, -2.0951F, 1.1924F, 0.1514F, -0.3206F));

		PartDefinition hips_r25 = bone8.addOrReplaceChild("hips_r25", CubeListBuilder.create().texOffs(25, 73).mirror().addBox(-0.5F, -0.825F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.5969F, -1.883F, -1.668F, 0.6021F, 0.0F, -0.1309F));

		PartDefinition hips_r26 = bone8.addOrReplaceChild("hips_r26", CubeListBuilder.create().texOffs(35, 53).mirror().addBox(-0.6782F, -0.3984F, 0.3392F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.0F, 0.0F, 0.6458F, 0.0F, -0.3491F));

		PartDefinition hips_r27 = bone8.addOrReplaceChild("hips_r27", CubeListBuilder.create().texOffs(9, 48).mirror().addBox(-0.275F, -1.4F, -1.8F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(-0.4792F, -0.7955F, 0.0516F, 0.0012F, 0.0226F, -0.2468F));

		PartDefinition hips_r28 = bone8.addOrReplaceChild("hips_r28", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(-0.5242F, -0.3551F, -0.2705F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -0.6854F, -2.0951F, -0.896F, 0.1451F, -0.3186F));

		PartDefinition hips_r29 = bone8.addOrReplaceChild("hips_r29", CubeListBuilder.create().texOffs(75, 78).mirror().addBox(-0.5242F, -0.2672F, -0.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2248F, -0.6854F, -2.0951F, 0.5003F, 0.1451F, -0.3186F));

		PartDefinition hips_r30 = bone8.addOrReplaceChild("hips_r30", CubeListBuilder.create().texOffs(45, 78).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0899F, -0.0563F, 0.0954F, 0.2618F, 0.0F, -0.3491F));

		PartDefinition hips_r31 = bone8.addOrReplaceChild("hips_r31", CubeListBuilder.create().texOffs(78, 39).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-0.3027F, -1.1349F, 1.3091F, 0.8306F, -0.0594F, -0.3442F));

		PartDefinition hips_r32 = bone8.addOrReplaceChild("hips_r32", CubeListBuilder.create().texOffs(7, 53).mirror().addBox(-0.225F, 0.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.6134F, -1.1642F, 0.0233F, 1.2143F, 0.0305F, -0.2673F));

		PartDefinition hips_r33 = bone8.addOrReplaceChild("hips_r33", CubeListBuilder.create().texOffs(46, 28).mirror().addBox(-0.817F, -4.1407F, -1.5738F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1658F, 0.0F, -0.1309F));

		PartDefinition leftLeg = hips.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 3.3207F, 2.7902F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(73, 68).addBox(-0.5F, -0.9981F, -0.9886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.5F, -0.8421F, -0.4258F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(57, 22).addBox(-1.5F, -0.0966F, 0.2895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, -0.1768F, 0.243F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r3 = leftLeg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(27, 40).addBox(-1.5F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.5F, 0.0232F, -0.357F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(57, 13).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.2575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r5 = leftLeg.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(43, 67).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -0.9575F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = leftLeg.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(47, 57).addBox(-0.5F, -2.9665F, -1.2152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, 0.0425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r7 = leftLeg.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(21, 57).addBox(-1.0F, -1.8674F, 1.493F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.6003F, -0.8503F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r8 = leftLeg.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(57, 19).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.2404F, -1.2985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r9 = leftLeg.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(78, 68).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4714F, -1.0835F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r10 = leftLeg.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(69, 12).addBox(-0.5F, 0.242F, -0.2153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.6652F, -1.5822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r11 = leftLeg.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 67).addBox(-0.5F, -1.9224F, -0.7835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.2575F, -1.1162F, -0.4014F, 0.0F, 0.0F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create().texOffs(64, 18).addBox(0.3F, 0.0509F, 0.1829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.1141F, -1.4251F, 1.3265F, 0.0F, 0.0F));

		PartDefinition cube_r12 = leftLeg2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 62).addBox(-1.3F, 0.0072F, -0.7522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(39, 63).addBox(-1.3F, 0.0072F, -1.1522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.0604F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r13 = leftLeg2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 57).addBox(-1.3F, -0.125F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3255F, 0.8396F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r14 = leftLeg2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(47, 62).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.8F, 2.5187F, 0.4635F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r15 = leftLeg2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 28).addBox(-1.0F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 4.3096F, -0.5707F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r16 = leftLeg2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 73).addBox(-1.4F, -1.8877F, -0.9982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.6F, 2.9719F, 0.1839F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r17 = leftLeg2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(57, 72).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(0.8F, 4.3259F, -0.0048F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftLeg2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(73, 40).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 4.4673F, -0.2497F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftLeg2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(10, 74).addBox(-0.3F, -0.2718F, 0.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6F, 4.0409F, -0.9594F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = leftLeg2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 72).addBox(-0.5F, 0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.5824F, -0.4332F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r21 = leftLeg2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 79).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.8F, 0.8976F, 0.9171F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r22 = leftLeg2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(0.8F, 0.4364F, 0.814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r23 = leftLeg2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 69).addBox(-1.4F, -2.1718F, -0.0792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6F, 4.0409F, -0.9594F, -0.1309F, 0.0F, 0.0F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9554F, -0.2872F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r24 = leftLeg3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 41).addBox(-1.5F, -1.1F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r25 = leftLeg3.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(27, 44).addBox(-1.5F, 0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.1047F, 0.0F, 0.0F));

		PartDefinition leftArm6 = leftLeg3.addOrReplaceChild("leftArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0384F, 2.8284F, 1.4019F, 1.1868F, 0.0F, 0.0F));

		PartDefinition cube_r26 = leftArm6.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(36, 44).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightLeg = hips.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 3.3207F, 2.7902F, 0.6283F, 0.0F, 0.0F));

		PartDefinition cube_r27 = rightLeg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(40, 74).addBox(-0.5F, -0.9981F, -0.9886F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.5F, -0.8421F, -0.4258F, 2.6267F, 0.0F, 0.0F));

		PartDefinition cube_r28 = rightLeg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(40, 57).addBox(-0.5F, -0.0966F, 0.2895F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.5F, -0.1768F, 0.243F, -2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r29 = rightLeg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(36, 40).addBox(-0.5F, -0.75F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.5F, 0.0232F, -0.357F, -1.8588F, 0.0F, 0.0F));

		PartDefinition cube_r30 = rightLeg.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(57, 16).addBox(-1.0F, -3.4F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.255F, -0.2575F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r31 = rightLeg.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(69, 0).addBox(-0.5F, -0.0494F, -0.0909F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.755F, -0.9575F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r32 = rightLeg.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 59).addBox(-0.5F, -2.9665F, -1.2152F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.655F, 0.0425F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r33 = rightLeg.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(33, 57).addBox(-1.0F, -1.8674F, 1.493F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(0.0F, 8.6003F, -0.8503F, 0.9338F, 0.0F, 0.0F));

		PartDefinition cube_r34 = rightLeg.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(57, 25).addBox(-1.0F, -0.3F, -0.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0F, 6.2404F, -1.2985F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r35 = rightLeg.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 78).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.0F, 5.4714F, -1.0835F, 1.8151F, 0.0F, 0.0F));

		PartDefinition cube_r36 = rightLeg.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(69, 20).addBox(-0.5F, 0.242F, -0.2153F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 4.6652F, -1.5822F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = rightLeg.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(68, 68).addBox(-0.5F, -1.9224F, -0.7835F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, 5.2575F, -1.1162F, -0.4014F, 0.0F, 0.0F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create().texOffs(64, 22).addBox(-1.3F, 0.0509F, 0.1829F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 7.1141F, -1.4251F, 0.8465F, 0.0F, 0.0F));

		PartDefinition cube_r38 = rightLeg2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(62, 47).addBox(-0.7F, 0.0072F, -0.7522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F))
				.texOffs(63, 50).addBox(-0.7F, 0.0072F, -1.1522F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 0.1255F, -0.0604F, 0.8988F, 0.0F, 0.0F));

		PartDefinition cube_r39 = rightLeg2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(57, 10).addBox(-0.7F, -0.125F, -0.925F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.3255F, 0.8396F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r40 = rightLeg2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(62, 59).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(-0.8F, 2.5187F, 0.4635F, -0.288F, 0.0F, 0.0F));

		PartDefinition cube_r41 = rightLeg2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(33, 60).addBox(-1.0F, -0.5F, -0.425F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 4.3096F, -0.5707F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r42 = rightLeg2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(35, 73).addBox(0.4F, -1.8877F, -0.9982F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.6F, 2.9719F, 0.1839F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r43 = rightLeg2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(67, 72).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.209F)), PartPose.offsetAndRotation(-0.8F, 4.3259F, -0.0048F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r44 = rightLeg2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(73, 53).addBox(-0.5F, -0.55F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 4.4673F, -0.2497F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r45 = rightLeg2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(74, 56).addBox(-0.7F, -0.2718F, 0.5958F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.6F, 4.0409F, -0.9594F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r46 = rightLeg2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(73, 7).addBox(-0.5F, 0.5F, -0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 0.5824F, -0.4332F, 1.789F, 0.0F, 0.0F));

		PartDefinition cube_r47 = rightLeg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(79, 27).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.8F, 0.8976F, 0.9171F, 2.7053F, 0.0F, 0.0F));

		PartDefinition cube_r48 = rightLeg2.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(74, 47).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.196F)), PartPose.offsetAndRotation(-0.8F, 0.4364F, 0.814F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r49 = rightLeg2.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(69, 64).addBox(0.4F, -2.1718F, -0.0792F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.6F, 4.0409F, -0.9594F, -0.1309F, 0.0F, 0.0F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9554F, -0.2872F, -2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r50 = rightLeg3.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(41, 2).addBox(-1.5F, -1.1F, -1.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.7592F, 0.0F, 0.0F));

		PartDefinition cube_r51 = rightLeg3.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(45, 40).addBox(-1.5F, 0.5F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, 0.3259F, 1.0933F, 0.1047F, 0.0F, 0.0F));

		PartDefinition rightArm6 = rightLeg3.addOrReplaceChild("rightArm6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0384F, 2.8284F, 1.4019F, 0.925F, 0.0F, 0.0F));

		PartDefinition cube_r52 = rightArm6.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(45, 44).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0601F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5F, -0.2F, 0.132F, -0.1298F, -0.0172F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(30, 82).addBox(0.0F, -1.0065F, -0.0226F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4687F, -0.8658F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(27, 82).addBox(0.0F, -1.3309F, -0.8501F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2687F, -2.0658F, -0.192F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(60, 81).addBox(0.0F, -1.1164F, -0.1021F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.7658F, -0.1833F, 0.0F, 0.0F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(0, 16).addBox(-1.5F, -2.0523F, 0.3675F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.1313F, -4.0658F, 0.5498F, 0.0F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, -0.1269F, -0.0027F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8687F, -4.8658F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r53 = body.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(67, 58).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.115F, -0.4408F, 0.1218F, 0.0123F, -0.7501F));

		PartDefinition cube_r54 = body.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(80, 79).mirror().addBox(-2.6229F, -1.1114F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.115F, -0.4408F, 0.0566F, 0.0705F, -1.2921F));

		PartDefinition cube_r55 = body.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(67, 35).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -2.3408F, 0.2464F, 0.0525F, -0.6588F));

		PartDefinition cube_r56 = body.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(29, 66).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.315F, -2.3408F, 0.1435F, 0.1689F, -1.1944F));

		PartDefinition cube_r57 = body.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(66, 8).mirror().addBox(-3.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.203F, 0.2339F, -1.0778F));

		PartDefinition cube_r58 = body.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(45, 0).mirror().addBox(-3.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.0566F, 0.3034F, -1.6166F));

		PartDefinition cube_r59 = body.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(67, 28).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.515F, -4.3408F, 0.3298F, 0.0789F, -0.5486F));

		PartDefinition cube_r60 = body.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(67, 58).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.115F, -0.4408F, 0.1218F, -0.0123F, 0.7501F));

		PartDefinition cube_r61 = body.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(80, 79).addBox(1.6229F, -1.1114F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.115F, -0.4408F, 0.0566F, -0.0705F, 1.2921F));

		PartDefinition cube_r62 = body.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(67, 35).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.315F, -2.3408F, 0.2464F, -0.0525F, 0.6588F));

		PartDefinition cube_r63 = body.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(29, 66).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.315F, -2.3408F, 0.1435F, -0.1689F, 1.1944F));

		PartDefinition cube_r64 = body.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(66, 8).addBox(1.6229F, -1.1114F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.203F, -0.2339F, 1.0778F));

		PartDefinition cube_r65 = body.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(45, 0).addBox(2.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.0566F, -0.3034F, 1.6166F));

		PartDefinition cube_r66 = body.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(67, 28).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.515F, -4.3408F, 0.3298F, -0.0789F, 0.5486F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5687F, -4.8658F, 0.0354F, -0.1744F, -0.0062F));

		PartDefinition body_r6 = body2.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(48, 81).addBox(0.0F, -1.1375F, -0.1825F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -3.6F, -0.0262F, 0.0F, 0.0F));

		PartDefinition body_r7 = body2.addOrReplaceChild("body_r7", CubeListBuilder.create().texOffs(45, 81).addBox(0.0F, -1.1675F, 0.11F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -5.9F, 0.0175F, 0.0F, 0.0F));

		PartDefinition body_r8 = body2.addOrReplaceChild("body_r8", CubeListBuilder.create().texOffs(0, 81).addBox(0.0F, -0.9978F, -0.1219F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.1F, -7.7F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r67 = body2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-4.5794F, -2.5744F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.0752F, 0.3889F, -1.558F));

		PartDefinition cube_r68 = body2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(65, 31).mirror().addBox(-3.5211F, -0.9398F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.2643F, 0.298F, -1.0093F));

		PartDefinition cube_r69 = body2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(36, 68).mirror().addBox(-1.7884F, -0.0168F, -0.5105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -1.475F, 0.4135F, 0.1047F, -0.4885F));

		PartDefinition cube_r70 = body2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(69, 10).mirror().addBox(-1.6006F, 0.0541F, -0.5201F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.4135F, 0.1047F, -0.4187F));

		PartDefinition cube_r71 = body2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(29, 68).mirror().addBox(-3.3972F, -0.7816F, -0.5481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.2643F, 0.298F, -0.9395F));

		PartDefinition cube_r72 = body2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(50, 4).mirror().addBox(-5.5513F, -2.3755F, -0.5481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.0537F, -3.275F, 0.0752F, 0.3889F, -1.4882F));

		PartDefinition cube_r73 = body2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(67, 62).mirror().addBox(-1.5949F, 0.0412F, -0.5171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.4323F, 0.1041F, -0.3816F));

		PartDefinition cube_r74 = body2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(67, 60).mirror().addBox(-3.3856F, -0.7897F, -0.5455F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.2817F, 0.3068F, -0.8991F));

		PartDefinition cube_r75 = body2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(40, 38).mirror().addBox(-6.5371F, -2.3767F, -0.5455F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3537F, -5.275F, 0.0855F, 0.405F, -1.449F));

		PartDefinition cube_r76 = body2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(12, 65).mirror().addBox(-1.5877F, 0.024F, -0.5075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.4316F, 0.1058F, -0.3292F));

		PartDefinition cube_r77 = body2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(5, 65).mirror().addBox(-3.3705F, -0.8011F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.2802F, 0.3079F, -0.8472F));

		PartDefinition cube_r78 = body2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(40, 34).mirror().addBox(-6.5184F, -2.379F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.6537F, -7.275F, 0.0836F, 0.4052F, -1.3974F));

		PartDefinition cube_r79 = body2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 33).addBox(2.5795F, -2.5744F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.0752F, -0.3889F, 1.558F));

		PartDefinition cube_r80 = body2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(65, 31).addBox(1.5211F, -0.9398F, -0.5447F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.2643F, -0.298F, 1.0093F));

		PartDefinition cube_r81 = body2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(36, 68).addBox(-0.2116F, -0.0168F, -0.5105F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -1.475F, 0.4135F, -0.1047F, 0.4885F));

		PartDefinition cube_r82 = body2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(69, 10).addBox(-0.3994F, 0.0541F, -0.5201F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.4135F, -0.1047F, 0.4187F));

		PartDefinition cube_r83 = body2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(29, 68).addBox(1.3972F, -0.7816F, -0.5481F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.2643F, -0.298F, 0.9395F));

		PartDefinition cube_r84 = body2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(50, 4).addBox(2.5513F, -2.3755F, -0.5481F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0537F, -3.275F, 0.0752F, -0.3889F, 1.4882F));

		PartDefinition cube_r85 = body2.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(67, 62).addBox(-0.4052F, 0.0412F, -0.5171F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.4323F, -0.1041F, 0.3816F));

		PartDefinition cube_r86 = body2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(67, 60).addBox(1.3856F, -0.7897F, -0.5455F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.2817F, -0.3068F, 0.8991F));

		PartDefinition cube_r87 = body2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(40, 38).addBox(2.5371F, -2.3767F, -0.5455F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3537F, -5.275F, 0.0855F, -0.405F, 1.449F));

		PartDefinition cube_r88 = body2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(12, 65).addBox(-0.4123F, 0.024F, -0.5075F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.4316F, -0.1058F, 0.3292F));

		PartDefinition cube_r89 = body2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(5, 65).addBox(1.3705F, -0.8011F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.2802F, -0.3079F, 0.8472F));

		PartDefinition cube_r90 = body2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(40, 34).addBox(2.5184F, -2.379F, -0.5365F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.6537F, -7.275F, 0.0836F, -0.4052F, 1.3974F));

		PartDefinition body_r9 = body2.addOrReplaceChild("body_r9", CubeListBuilder.create().texOffs(15, 8).addBox(-0.5F, -0.0286F, -6.0567F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, -2.8F, 0.1484F, 0.0F, 0.0F));

		PartDefinition body_r10 = body2.addOrReplaceChild("body_r10", CubeListBuilder.create().texOffs(72, 81).addBox(0.0F, -1.2617F, -0.0047F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.0F, -0.0611F, 0.0F, 0.0F));

		PartDefinition body_r11 = body2.addOrReplaceChild("body_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -2.3336F, -4.9569F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.85F, 0.8F, 0.0262F, 0.0F, 0.0F));

		PartDefinition body_r12 = body2.addOrReplaceChild("body_r12", CubeListBuilder.create().texOffs(31, 35).addBox(-0.5F, -0.2792F, -0.0049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition bodyfront = body2.addOrReplaceChild("bodyfront", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.7045F, -8.8635F, 0.142F, -0.0864F, -0.0123F));

		PartDefinition Front_r1 = bodyfront.addOrReplaceChild("Front_r1", CubeListBuilder.create().texOffs(59, 7).mirror().addBox(0.225F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-1.5F, 4.5148F, -5.9798F, -0.9389F, -0.9025F, 0.8203F));

		PartDefinition Front_r2 = bodyfront.addOrReplaceChild("Front_r2", CubeListBuilder.create().texOffs(40, 36).mirror().addBox(-3.6484F, 0.2619F, -0.6624F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 6.0445F, -3.0647F, -0.3212F, 0.2477F, 0.4397F));

		PartDefinition Front_r3 = bodyfront.addOrReplaceChild("Front_r3", CubeListBuilder.create().texOffs(28, 16).mirror().addBox(-6.8271F, -0.175F, -0.182F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.1445F, 2.4353F, 0.1755F, 1.048F, 0.6716F));

		PartDefinition Front_r4 = bodyfront.addOrReplaceChild("Front_r4", CubeListBuilder.create().texOffs(30, 0).mirror().addBox(-5.6916F, -0.2697F, -0.0601F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.1445F, 2.4353F, -0.0183F, 0.9202F, 0.4906F));

		PartDefinition Front_r5 = bodyfront.addOrReplaceChild("Front_r5", CubeListBuilder.create().texOffs(11, 30).mirror().addBox(-4.2013F, -0.2247F, -0.124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 7.1445F, 2.4353F, -0.172F, 0.6594F, 0.2783F));

		PartDefinition Front_r6 = bodyfront.addOrReplaceChild("Front_r6", CubeListBuilder.create().texOffs(43, 10).mirror().addBox(-3.6547F, -0.0476F, -0.1366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.9445F, 2.0353F, -0.1508F, 0.1509F, 0.2393F));

		PartDefinition Front_r7 = bodyfront.addOrReplaceChild("Front_r7", CubeListBuilder.create().texOffs(30, 10).mirror().addBox(-3.8638F, -0.2188F, -0.4566F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.9445F, 0.2353F, -0.4378F, 0.1865F, 0.4293F));

		PartDefinition Front_r8 = bodyfront.addOrReplaceChild("Front_r8", CubeListBuilder.create().texOffs(30, 8).mirror().addBox(-3.9408F, -0.2754F, -0.4857F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 6.8445F, -1.6647F, -0.4547F, 0.2452F, 0.388F));

		PartDefinition cube_r91 = bodyfront.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 64).mirror().addBox(-4.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.0797F, 0.4147F, -1.4341F));

		PartDefinition cube_r92 = bodyfront.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(66, 6).mirror().addBox(-3.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.2822F, 0.3179F, -0.8817F));

		PartDefinition cube_r93 = bodyfront.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(68, 45).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.4383F, 0.1135F, -0.3637F));

		PartDefinition cube_r94 = bodyfront.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(66, 4).mirror().addBox(-1.5836F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.3549F, 0.0867F, -0.3021F));

		PartDefinition cube_r95 = bodyfront.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(64, 26).mirror().addBox(-3.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.2212F, 0.2532F, -0.829F));

		PartDefinition cube_r96 = bodyfront.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(45, 16).mirror().addBox(-5.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4114F, -2.2016F, 0.062F, 0.3291F, -1.3706F));

		PartDefinition cube_r97 = bodyfront.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(57, 66).mirror().addBox(-1.5836F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.2547F, 0.0552F, -0.3093F));

		PartDefinition cube_r98 = bodyfront.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(36, 66).mirror().addBox(-3.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.1494F, 0.1755F, -0.8443F));

		PartDefinition cube_r99 = bodyfront.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(51, 37).mirror().addBox(-5.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3114F, -0.1016F, 0.0407F, 0.2264F, -1.3765F));

		PartDefinition Front_r9 = bodyfront.addOrReplaceChild("Front_r9", CubeListBuilder.create().texOffs(59, 7).addBox(-2.225F, -0.5F, -0.325F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.5F, 4.5148F, -5.9798F, -0.9389F, 0.9025F, -0.8203F));

		PartDefinition Front_r10 = bodyfront.addOrReplaceChild("Front_r10", CubeListBuilder.create().texOffs(9, 36).addBox(-2.0F, -2.7529F, -3.1641F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.001F))
				.texOffs(26, 23).addBox(-1.0F, -2.7529F, -2.1641F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.7979F, -4.799F, -0.5236F, 0.0F, 0.0F));

		PartDefinition Front_r11 = bodyfront.addOrReplaceChild("Front_r11", CubeListBuilder.create().texOffs(40, 36).addBox(-0.3516F, 0.2619F, -0.6624F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0445F, -3.0647F, -0.3212F, -0.2477F, -0.4397F));

		PartDefinition Front_r12 = bodyfront.addOrReplaceChild("Front_r12", CubeListBuilder.create().texOffs(28, 16).addBox(-0.1729F, -0.175F, -0.182F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.1445F, 2.4353F, 0.1755F, -1.048F, -0.6716F));

		PartDefinition Front_r13 = bodyfront.addOrReplaceChild("Front_r13", CubeListBuilder.create().texOffs(30, 0).addBox(-0.3084F, -0.2697F, -0.0601F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.1445F, 2.4353F, -0.0183F, -0.9202F, -0.4906F));

		PartDefinition Front_r14 = bodyfront.addOrReplaceChild("Front_r14", CubeListBuilder.create().texOffs(11, 30).addBox(-0.7987F, -0.2247F, -0.124F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 7.1445F, 2.4353F, -0.172F, -0.6594F, -0.2783F));

		PartDefinition Front_r15 = bodyfront.addOrReplaceChild("Front_r15", CubeListBuilder.create().texOffs(43, 10).addBox(-0.3453F, -0.0476F, -0.1366F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9445F, 2.0353F, -0.1508F, -0.1509F, -0.2393F));

		PartDefinition Front_r16 = bodyfront.addOrReplaceChild("Front_r16", CubeListBuilder.create().texOffs(30, 10).addBox(-1.1362F, -0.2188F, -0.4566F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.9445F, 0.2353F, -0.4378F, -0.1865F, -0.4293F));

		PartDefinition Front_r17 = bodyfront.addOrReplaceChild("Front_r17", CubeListBuilder.create().texOffs(30, 8).addBox(-1.0592F, -0.2754F, -0.4857F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 6.8445F, -1.6647F, -0.4547F, -0.2452F, -0.388F));

		PartDefinition Front_r18 = bodyfront.addOrReplaceChild("Front_r18", CubeListBuilder.create().texOffs(17, 0).addBox(-0.5F, -0.9547F, -0.0884F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, 7.0979F, -2.224F, -0.0829F, 0.0F, 0.0F));

		PartDefinition bodyfront_r1 = bodyfront.addOrReplaceChild("bodyfront_r1", CubeListBuilder.create().texOffs(57, 81).addBox(0.0F, -1.6449F, -0.3761F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 81).addBox(0.0F, -2.0449F, 1.6239F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4485F, -2.4107F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront_r2 = bodyfront.addOrReplaceChild("bodyfront_r2", CubeListBuilder.create().texOffs(51, 81).addBox(0.0F, -1.616F, -0.1669F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6485F, -4.7107F, -0.1134F, 0.0F, 0.0F));

		PartDefinition bodyfront_r3 = bodyfront.addOrReplaceChild("bodyfront_r3", CubeListBuilder.create().texOffs(15, 16).addBox(-0.5F, -0.9385F, 1.0114F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.2485F, -5.7107F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r100 = bodyfront.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(57, 64).addBox(2.5818F, -2.7739F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.0797F, -0.4147F, 1.4341F));

		PartDefinition cube_r101 = bodyfront.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(66, 6).addBox(1.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.2822F, -0.3179F, 0.8817F));

		PartDefinition cube_r102 = bodyfront.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(68, 45).addBox(-0.0359F, -0.1102F, -0.4897F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7114F, -4.2016F, 0.4383F, -0.1135F, 0.3637F));

		PartDefinition cube_r103 = bodyfront.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(66, 4).addBox(-0.4164F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.3549F, -0.0867F, 0.3021F));

		PartDefinition cube_r104 = bodyfront.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(64, 26).addBox(1.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.2212F, -0.2532F, 0.829F));

		PartDefinition cube_r105 = bodyfront.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(45, 16).addBox(2.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4114F, -2.2016F, 0.062F, -0.3291F, 1.3706F));

		PartDefinition cube_r106 = bodyfront.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(57, 66).addBox(-0.4164F, 0.0129F, -0.5001F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.2547F, -0.0552F, 0.3093F));

		PartDefinition cube_r107 = bodyfront.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(36, 66).addBox(1.3613F, -0.8088F, -0.5293F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.1494F, -0.1755F, 0.8443F));

		PartDefinition cube_r108 = bodyfront.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(51, 37).addBox(2.5065F, -2.381F, -0.5293F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.3114F, -0.1016F, 0.0407F, -0.2264F, 1.3765F));

		PartDefinition chest = bodyfront.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.5485F, -4.7107F, 0.0F, 0.0436F, 0.0F));

		PartDefinition bodyfront_r4 = chest.addOrReplaceChild("bodyfront_r4", CubeListBuilder.create().texOffs(24, 82).addBox(0.0F, -1.1812F, -0.1076F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, -1.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(5, 67).mirror().addBox(-3.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0629F, -1.4909F, 0.4447F, 0.5107F, -0.9393F));

		PartDefinition cube_r110 = chest.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(81, 24).mirror().addBox(-1.9641F, -0.1102F, -0.4897F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0629F, -1.4909F, 0.6645F, 0.2106F, -0.4505F));

		PartDefinition cube_r111 = chest.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(80, 77).mirror().addBox(-3.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0629F, -1.4909F, 0.102F, 0.6573F, -1.546F));

		PartDefinition cube_r112 = chest.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(80, 77).addBox(2.5818F, -2.7739F, -0.5307F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0629F, -1.4909F, 0.102F, -0.6573F, 1.546F));

		PartDefinition cube_r113 = chest.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(5, 67).addBox(1.6229F, -1.1113F, -0.5307F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0629F, -1.4909F, 0.4447F, -0.5107F, 0.9393F));

		PartDefinition cube_r114 = chest.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(81, 24).addBox(0.9641F, -0.1102F, -0.4897F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0629F, -1.4909F, 0.6645F, -0.2106F, 0.4505F));

		PartDefinition bodyfront_r5 = chest.addOrReplaceChild("bodyfront_r5", CubeListBuilder.create().texOffs(14, 53).addBox(-0.5F, -1.2F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, 0.5F, -4.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0042F, 2.4009F, 1.9393F, 0.0F, 0.0F, 0.0873F));

		PartDefinition bodyfront_r6 = bone.addOrReplaceChild("bodyfront_r6", CubeListBuilder.create().texOffs(42, 53).addBox(-0.5F, -0.525F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-0.1109F, 1.8659F, -1.6405F, -1.3854F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r7 = bone.addOrReplaceChild("bodyfront_r7", CubeListBuilder.create().texOffs(15, 79).addBox(-0.4674F, -1.0526F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.1729F, 1.3093F, -1.3807F, -1.4291F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r8 = bone.addOrReplaceChild("bodyfront_r8", CubeListBuilder.create().texOffs(79, 18).addBox(-0.5F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(-0.0323F, 1.5316F, -0.907F, -0.8182F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r9 = bone.addOrReplaceChild("bodyfront_r9", CubeListBuilder.create().texOffs(35, 76).addBox(-0.5174F, -0.1639F, -1.6861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F))
				.texOffs(50, 78).addBox(-0.4674F, -1.1139F, -1.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(-0.1729F, 1.3093F, -1.3807F, -1.1673F, 0.1632F, -0.1283F));

		PartDefinition bodyfront_r10 = bone.addOrReplaceChild("bodyfront_r10", CubeListBuilder.create().texOffs(28, 57).addBox(-0.6515F, -3.0168F, -1.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.1353F, 0.2478F, -0.4962F));

		PartDefinition bodyfront_r11 = bone.addOrReplaceChild("bodyfront_r11", CubeListBuilder.create().texOffs(9, 39).addBox(-0.6515F, -1.2134F, -0.2032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 1.1039F, 0.2478F, -0.4962F));

		PartDefinition Front_r19 = bone.addOrReplaceChild("Front_r19", CubeListBuilder.create().texOffs(48, 25).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.9002F, -0.4537F, -2.9818F, -0.4339F, -0.8238F, -1.2786F));

		PartDefinition Front_r20 = bone.addOrReplaceChild("Front_r20", CubeListBuilder.create().texOffs(14, 57).addBox(0.134F, -2.637F, -0.9454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6748F, 2.8925F, -4.7716F, -0.7018F, 0.0074F, -1.0666F));

		PartDefinition bodyfront_r12 = bone.addOrReplaceChild("bodyfront_r12", CubeListBuilder.create().texOffs(18, 40).addBox(-0.5F, -1.8173F, -3.3096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, 0.2182F, -0.1571F));

		PartDefinition bodyfront_r13 = bone.addOrReplaceChild("bodyfront_r13", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -1.475F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.209F, 2.013F, -2.3518F, 1.3082F, 0.2037F, -0.1755F));

		PartDefinition bone7 = chest.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0042F, 2.4009F, 1.9393F, 0.0F, 0.0F, -0.0873F));

		PartDefinition bodyfront_r14 = bone7.addOrReplaceChild("bodyfront_r14", CubeListBuilder.create().texOffs(42, 53).mirror().addBox(-0.5F, -0.525F, -1.325F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(0.1109F, 1.8659F, -1.6405F, -1.3854F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r15 = bone7.addOrReplaceChild("bodyfront_r15", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.5326F, -1.0526F, -0.4007F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 1.3093F, -1.3807F, -1.4291F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r16 = bone7.addOrReplaceChild("bodyfront_r16", CubeListBuilder.create().texOffs(79, 18).mirror().addBox(-0.5F, -0.325F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(0.0323F, 1.5316F, -0.907F, -0.8182F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r17 = bone7.addOrReplaceChild("bodyfront_r17", CubeListBuilder.create().texOffs(35, 76).mirror().addBox(-0.4826F, -0.1639F, -1.6861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false)
				.texOffs(50, 78).mirror().addBox(-0.5326F, -1.1139F, -1.0861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(0.1729F, 1.3093F, -1.3807F, -1.1673F, -0.1632F, 0.1283F));

		PartDefinition bodyfront_r18 = bone7.addOrReplaceChild("bodyfront_r18", CubeListBuilder.create().texOffs(28, 57).mirror().addBox(-0.3485F, -3.0168F, -1.1721F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.012F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, -0.1353F, -0.2478F, 0.4962F));

		PartDefinition bodyfront_r19 = bone7.addOrReplaceChild("bodyfront_r19", CubeListBuilder.create().texOffs(9, 39).mirror().addBox(-0.3485F, -1.2134F, -0.2032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.2F, -0.7F, 1.1039F, -0.2478F, 0.4962F));

		PartDefinition Front_r21 = bone7.addOrReplaceChild("Front_r21", CubeListBuilder.create().texOffs(48, 25).mirror().addBox(-1.5F, -0.8F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.9002F, -0.4537F, -2.9818F, -0.4339F, 0.8238F, 1.2786F));

		PartDefinition Front_r22 = bone7.addOrReplaceChild("Front_r22", CubeListBuilder.create().texOffs(14, 57).mirror().addBox(-2.134F, -2.637F, -0.9454F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.6748F, 2.8925F, -4.7716F, -0.7018F, -0.0074F, 1.0666F));

		PartDefinition bodyfront_r20 = bone7.addOrReplaceChild("bodyfront_r20", CubeListBuilder.create().texOffs(18, 40).mirror().addBox(-0.5F, -1.8173F, -3.3096F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0036F, -0.2182F, 0.1571F));

		PartDefinition bodyfront_r21 = bone7.addOrReplaceChild("bodyfront_r21", CubeListBuilder.create().texOffs(0, 68).mirror().addBox(-0.5F, -1.475F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.209F, 2.013F, -2.3518F, 1.3082F, -0.2037F, 0.1755F));

		PartDefinition leftarm = chest.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4322F, 3.6415F, 1.3217F, 0.7839F, -0.009F, -0.0068F));

		PartDefinition cube_r115 = leftarm.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(40, 60).addBox(-1.0013F, 0.4358F, -0.6685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0013F, 4.4024F, 1.2325F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r116 = leftarm.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(61, 41).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.2207F, 1.5216F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r117 = leftarm.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(75, 75).addBox(0.5008F, 0.9003F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-1.0118F, -1.2961F, 0.0756F, -0.6895F, 0.0014F, -0.001F));

		PartDefinition cube_r118 = leftarm.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(68, 37).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0097F, 0.168F, 0.0161F, -0.5149F, 0.0012F, 0.0008F));

		PartDefinition cube_r119 = leftarm.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(5, 60).addBox(-0.0047F, -1.0439F, -0.1015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(-0.5F, 3.9673F, 0.1378F, 0.3053F, 0.0014F, -0.001F));

		PartDefinition cube_r120 = leftarm.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 62).addBox(-0.4992F, -0.0295F, -0.0451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 1.8347F, -1.4751F, 1.0689F, 0.0014F, -0.001F));

		PartDefinition cube_r121 = leftarm.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(70, 75).addBox(-0.5005F, -0.0815F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(-0.0098F, 0.9347F, -1.7751F, 0.2835F, 0.0014F, -0.001F));

		PartDefinition cube_r122 = leftarm.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(80, 42).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0098F, 0.3597F, -1.0001F, -0.3055F, 0.0014F, -0.001F));

		PartDefinition cube_r123 = leftarm.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(65, 75).addBox(-0.5013F, -0.4359F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0013F, 4.4024F, 1.1325F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r124 = leftarm.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5013F, -1.162F, -0.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0013F, 4.4024F, 1.1325F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r125 = leftarm.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 58).addBox(0.0F, -2.8961F, -1.0564F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 3.6885F, 1.1014F, 0.3927F, 0.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1616F, 6.522F, 1.3834F, -0.6021F, 0.0F, 0.0F));

		PartDefinition cube_r126 = leftarm2.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(55, 78).addBox(-0.5378F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.1764F, -0.8461F, 1.1201F, 1.5708F, 0.1396F, -1.5708F));

		PartDefinition cube_r127 = leftarm2.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(79, 0).addBox(0.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(79, 12).addBox(0.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(-0.136F, 1.1298F, -0.0451F, 1.5708F, -1.1083F, -1.5708F));

		PartDefinition cube_r128 = leftarm2.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(69, 16).addBox(-1.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.136F, -0.8702F, 1.3549F, -1.5708F, -1.5533F, 1.5708F));

		PartDefinition cube_r129 = leftarm2.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(15, 60).addBox(-0.3985F, -0.2752F, -0.0824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-0.1764F, 1.5704F, -0.4664F, 1.5708F, -1.4486F, -1.6232F));

		PartDefinition cube_r130 = leftarm2.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(19, 65).addBox(-0.675F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.6302F, 0.8895F, -0.4802F, 1.5708F, -1.1694F, -1.6232F));

		PartDefinition cube_r131 = leftarm2.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(78, 53).addBox(-0.775F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(78, 9).addBox(-0.775F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.6302F, 0.8895F, -0.4802F, -1.5708F, -1.1868F, 1.5184F));

		PartDefinition cube_r132 = leftarm2.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(68, 41).addBox(-0.0572F, -0.0033F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.3236F, 1.6454F, 0.0086F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition leftArm3 = leftarm2.addOrReplaceChild("leftArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1764F, 3.9496F, 0.3519F, -0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r133 = leftArm3.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(49, 53).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftArm4 = leftArm3.addOrReplaceChild("leftArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0236F, 1.8658F, 0.2065F, 0.4276F, -0.0002F, 0.0001F));

		PartDefinition cube_r134 = leftArm4.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(0, 45).addBox(-1.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition leftArm5 = leftArm4.addOrReplaceChild("leftArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0127F, 0.7642F, -1.4173F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r135 = leftArm5.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(30, 12).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition rightarm = chest.addOrReplaceChild("rightarm", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4322F, 3.6415F, 1.3217F, -0.3505F, 0.009F, 0.0068F));

		PartDefinition cube_r136 = rightarm.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(61, 38).addBox(-0.9987F, 0.4358F, -0.6685F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.0013F, 4.4024F, 1.2325F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r137 = rightarm.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(61, 44).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 5.2207F, 1.5216F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r138 = rightarm.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(78, 6).addBox(-1.5008F, 0.9003F, -0.4406F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0118F, -1.2961F, 0.0756F, -0.6895F, -0.0014F, 0.001F));

		PartDefinition cube_r139 = rightarm.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(58, 68).addBox(-0.5F, -0.325F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0097F, 0.168F, 0.0161F, -0.5149F, -0.0012F, -0.0008F));

		PartDefinition cube_r140 = rightarm.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(10, 60).addBox(-0.9953F, -1.0439F, -0.1015F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(0.5F, 3.9673F, 0.1378F, 0.3053F, -0.0014F, 0.001F));

		PartDefinition cube_r141 = rightarm.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(79, 65).addBox(-0.5008F, -0.0295F, -0.0451F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 1.8347F, -1.4751F, 1.0689F, -0.0014F, 0.001F));

		PartDefinition cube_r142 = rightarm.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(78, 3).addBox(-0.4995F, -0.0815F, -0.0088F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(0.0098F, 0.9347F, -1.7751F, 0.2835F, -0.0014F, 0.001F));

		PartDefinition cube_r143 = rightarm.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(80, 49).addBox(-0.5F, -0.3F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0098F, 0.3597F, -1.0001F, -0.3055F, -0.0014F, 0.001F));

		PartDefinition cube_r144 = rightarm.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(0, 78).addBox(-0.4987F, -0.4359F, -0.394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-0.0013F, 4.4024F, 1.1325F, 0.4189F, 0.0F, 0.0F));

		PartDefinition cube_r145 = rightarm.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(79, 33).addBox(-0.4987F, -1.162F, -0.2544F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.0013F, 4.4024F, 1.1325F, 0.8552F, 0.0F, 0.0F));

		PartDefinition cube_r146 = rightarm.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(52, 59).addBox(-1.0F, -2.8961F, -1.0564F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.5F, 3.6885F, 1.1014F, 0.3927F, 0.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1616F, 6.522F, 1.3834F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r147 = rightarm2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(65, 78).addBox(-0.4622F, -1.2741F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.1764F, -0.8461F, 1.1201F, 1.5708F, -0.1396F, 1.5708F));

		PartDefinition cube_r148 = rightarm2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(5, 79).addBox(-1.005F, -1.6866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0078F))
				.texOffs(79, 15).addBox(-1.005F, -1.0866F, -0.4596F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.136F, 1.1298F, -0.0451F, 1.5708F, 1.1083F, 1.5708F));

		PartDefinition cube_r149 = rightarm2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(17, 69).addBox(0.3598F, 0.5375F, -0.4596F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.136F, -0.8702F, 1.3549F, -1.5708F, 1.5533F, -1.5708F));

		PartDefinition cube_r150 = rightarm2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(20, 60).addBox(-0.6015F, -0.2752F, -0.0824F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(0.1764F, 1.5704F, -0.4664F, 1.5708F, 1.4486F, 1.6232F));

		PartDefinition cube_r151 = rightarm2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(24, 65).addBox(-0.325F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6302F, 0.8895F, -0.4802F, 1.5708F, 1.1694F, 1.6232F));

		PartDefinition cube_r152 = rightarm2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(60, 78).addBox(-0.225F, -1.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F))
				.texOffs(78, 36).addBox(-0.225F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6302F, 0.8895F, -0.4802F, -1.5708F, 1.1868F, -1.5184F));

		PartDefinition cube_r153 = rightarm2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(63, 68).addBox(-0.9428F, -0.0033F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.3236F, 1.6454F, 0.0086F, 1.5708F, 1.5184F, 1.5708F));

		PartDefinition rightArm3 = rightarm2.addOrReplaceChild("rightArm3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1764F, 3.9496F, 0.3519F, -0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r154 = rightArm3.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(0, 54).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0236F, -0.0931F, -0.0278F, 0.0436F, 0.0F, 0.0F));

		PartDefinition rightArm4 = rightArm3.addOrReplaceChild("rightArm4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0236F, 1.8658F, 0.2065F, 1.0385F, 0.0002F, -0.0001F));

		PartDefinition cube_r155 = rightArm4.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(18, 45).addBox(-2.0F, -0.4F, -0.3F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.0602F, -0.1907F, -1.0908F, 0.0F, 0.0F));

		PartDefinition rightArm5 = rightArm4.addOrReplaceChild("rightArm5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0127F, 0.7642F, -1.4173F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r156 = rightArm5.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(11, 32).addBox(-1.5F, -0.35F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(56, 55).addBox(-0.5F, -0.5784F, -1.9889F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.0618F, -1.8993F, -0.498F, -0.2536F, -0.0122F));

		PartDefinition neck_r1 = neck.addOrReplaceChild("neck_r1", CubeListBuilder.create().texOffs(33, 82).addBox(0.0F, -1.0612F, -0.0227F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.4784F, -1.9889F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck_r2 = neck.addOrReplaceChild("neck_r2", CubeListBuilder.create().texOffs(48, 48).mirror().addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4216F, -1.9889F, -0.6566F, -0.3703F, 0.2357F));

		PartDefinition neck_r3 = neck.addOrReplaceChild("neck_r3", CubeListBuilder.create().texOffs(48, 48).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4216F, -1.9889F, -0.6566F, 0.3703F, -0.2357F));

		PartDefinition neck4 = neck.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1912F, -2.0238F, 0.0655F, -0.2218F, -0.3079F));

		PartDefinition cube_r157 = neck4.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(0, 63).addBox(0.0F, -1.7183F, -0.1365F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2F, -2.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition neck_r4 = neck4.addOrReplaceChild("neck_r4", CubeListBuilder.create().texOffs(48, 68).mirror().addBox(-0.0029F, -0.4752F, -0.0013F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4F, -1.6F, -0.4891F, -0.2604F, 0.144F));

		PartDefinition neck_r5 = neck4.addOrReplaceChild("neck_r5", CubeListBuilder.create().texOffs(48, 68).addBox(0.0029F, -0.4752F, -0.0013F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4F, -1.6F, -0.4891F, 0.2604F, -0.144F));

		PartDefinition cube_r158 = neck4.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, -0.375F, -3.9F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4933F, -3.1929F, 0.1358F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(43, 6).addBox(-1.5F, -0.0082F, -0.9977F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.7627F, -2.3899F, 0.0218F, 0.0F, 0.0F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(53, 28).addBox(-1.0F, -0.0093F, -0.9758F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(0.0F, -1.7377F, -3.3899F, 0.0829F, 0.0F, 0.0F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(64, 64).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.0F, -0.7159F, -0.9011F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(30, 2).addBox(-0.5F, -0.6081F, -1.7645F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.0373F, -2.4899F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(77, 71).addBox(-0.5F, -0.175F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(0.0F, -1.5133F, -1.7482F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(40, 77).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.3063F, -0.9754F, -0.2618F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(28, 18).addBox(-1.5F, -0.175F, -0.775F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.0F, -1.5627F, -1.6899F, -0.0436F, 0.0F, 0.0F));

		PartDefinition lowerjaw1 = head.addOrReplaceChild("lowerjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9F, 0.754F, 0.8185F, 0.9941F, 0.0F, 0.0F));

		PartDefinition lowerjaw6_r1 = lowerjaw1.addOrReplaceChild("lowerjaw6_r1", CubeListBuilder.create().texOffs(79, 59).mirror().addBox(-0.4015F, -0.5343F, -2.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.7518F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r1 = lowerjaw1.addOrReplaceChild("lowerjaw5_r1", CubeListBuilder.create().texOffs(74, 18).mirror().addBox(-0.4015F, 0.6811F, -1.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, -0.0598F, -0.2886F, -0.024F));

		PartDefinition lowerjaw4_r1 = lowerjaw1.addOrReplaceChild("lowerjaw4_r1", CubeListBuilder.create().texOffs(79, 56).mirror().addBox(-0.4015F, 0.0109F, -1.3094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.8565F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r2 = lowerjaw1.addOrReplaceChild("lowerjaw5_r2", CubeListBuilder.create().texOffs(25, 76).mirror().addBox(-0.4015F, 1.7689F, -1.8105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, -0.3129F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r3 = lowerjaw1.addOrReplaceChild("lowerjaw5_r3", CubeListBuilder.create().texOffs(76, 24).mirror().addBox(-0.4015F, 0.0766F, -4.3653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.298F, -0.2886F, -0.024F));

		PartDefinition lowerjaw4_r2 = lowerjaw1.addOrReplaceChild("lowerjaw4_r2", CubeListBuilder.create().texOffs(20, 76).mirror().addBox(-0.4015F, 0.7681F, -3.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.1234F, -0.2886F, -0.024F));

		PartDefinition lowerjaw4_r3 = lowerjaw1.addOrReplaceChild("lowerjaw4_r3", CubeListBuilder.create().texOffs(74, 15).mirror().addBox(-0.4015F, 1.03F, -2.4107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0012F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, -0.0685F, -0.2886F, -0.024F));

		PartDefinition lowerjaw3_r1 = lowerjaw1.addOrReplaceChild("lowerjaw3_r1", CubeListBuilder.create().texOffs(54, 43).mirror().addBox(-0.4015F, 0.155F, -3.4031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, 0.0624F, -0.2886F, -0.024F));

		PartDefinition lowerjaw2_r1 = lowerjaw1.addOrReplaceChild("lowerjaw2_r1", CubeListBuilder.create().texOffs(79, 46).mirror().addBox(-0.4015F, 0.5537F, -1.3057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.26F, -0.0143F, -0.2343F, -0.2886F, -0.024F));

		PartDefinition lowerjaw5_r4 = lowerjaw1.addOrReplaceChild("lowerjaw5_r4", CubeListBuilder.create().texOffs(79, 59).addBox(-0.5985F, -0.5343F, -2.5192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.7518F, 0.2886F, 0.024F));

		PartDefinition lowerjaw4_r4 = lowerjaw1.addOrReplaceChild("lowerjaw4_r4", CubeListBuilder.create().texOffs(74, 18).addBox(-0.5985F, 0.6811F, -1.008F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, -0.0598F, 0.2886F, 0.024F));

		PartDefinition lowerjaw3_r2 = lowerjaw1.addOrReplaceChild("lowerjaw3_r2", CubeListBuilder.create().texOffs(79, 56).addBox(-0.5985F, 0.0109F, -1.3094F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.012F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.8565F, 0.2886F, 0.024F));

		PartDefinition lowerjaw4_r5 = lowerjaw1.addOrReplaceChild("lowerjaw4_r5", CubeListBuilder.create().texOffs(25, 76).addBox(-0.5985F, 1.7689F, -1.8105F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, -0.3129F, 0.2886F, 0.024F));

		PartDefinition lowerjaw4_r6 = lowerjaw1.addOrReplaceChild("lowerjaw4_r6", CubeListBuilder.create().texOffs(76, 24).addBox(-0.5985F, 0.0766F, -4.3653F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.298F, 0.2886F, 0.024F));

		PartDefinition lowerjaw3_r3 = lowerjaw1.addOrReplaceChild("lowerjaw3_r3", CubeListBuilder.create().texOffs(20, 76).addBox(-0.5985F, 0.7681F, -3.4389F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.1234F, 0.2886F, 0.024F));

		PartDefinition lowerjaw3_r4 = lowerjaw1.addOrReplaceChild("lowerjaw3_r4", CubeListBuilder.create().texOffs(74, 15).addBox(-0.5985F, 1.03F, -2.4107F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.0012F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, -0.0685F, 0.2886F, 0.024F));

		PartDefinition lowerjaw2_r2 = lowerjaw1.addOrReplaceChild("lowerjaw2_r2", CubeListBuilder.create().texOffs(54, 43).addBox(-0.5985F, 0.155F, -3.4031F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, 0.0624F, 0.2886F, 0.024F));

		PartDefinition lowerjaw1_r1 = lowerjaw1.addOrReplaceChild("lowerjaw1_r1", CubeListBuilder.create().texOffs(79, 46).addBox(-0.5985F, 0.5537F, -1.3057F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6F, -0.26F, -0.0143F, -0.2343F, 0.2886F, 0.024F));

		PartDefinition lowerjaw2 = lowerjaw1.addOrReplaceChild("lowerjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.16F, -5.4F, 0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjaw4_r7 = lowerjaw2.addOrReplaceChild("lowerjaw4_r7", CubeListBuilder.create().texOffs(28, 53).mirror().addBox(-0.4015F, 0.2186F, -6.3233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.2891F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw6_r2 = lowerjaw2.addOrReplaceChild("lowerjaw6_r2", CubeListBuilder.create().texOffs(74, 12).mirror().addBox(-0.4015F, 0.0812F, -7.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.3065F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw4_r8 = lowerjaw2.addOrReplaceChild("lowerjaw4_r8", CubeListBuilder.create().texOffs(75, 43).mirror().addBox(-0.4015F, 0.5233F, -7.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.1625F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw4_r9 = lowerjaw2.addOrReplaceChild("lowerjaw4_r9", CubeListBuilder.create().texOffs(54, 39).mirror().addBox(-0.4015F, -1.1519F, -4.3781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.4592F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw3_r5 = lowerjaw2.addOrReplaceChild("lowerjaw3_r5", CubeListBuilder.create().texOffs(16, 49).mirror().addBox(-0.4015F, -0.747F, -6.2912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -0.42F, 5.3857F, 0.372F, -0.2895F, 0.0071F));

		PartDefinition lowerjaw3_r6 = lowerjaw2.addOrReplaceChild("lowerjaw3_r6", CubeListBuilder.create().texOffs(28, 53).addBox(-0.5985F, 0.2186F, -6.3233F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.2891F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw5_r5 = lowerjaw2.addOrReplaceChild("lowerjaw5_r5", CubeListBuilder.create().texOffs(74, 12).addBox(-0.5985F, 0.0812F, -7.1985F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.3065F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw3_r7 = lowerjaw2.addOrReplaceChild("lowerjaw3_r7", CubeListBuilder.create().texOffs(75, 43).addBox(-0.5985F, 0.5233F, -7.1035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.1625F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw3_r8 = lowerjaw2.addOrReplaceChild("lowerjaw3_r8", CubeListBuilder.create().texOffs(54, 39).addBox(-0.5985F, -1.1519F, -4.3781F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.4592F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw2_r3 = lowerjaw2.addOrReplaceChild("lowerjaw2_r3", CubeListBuilder.create().texOffs(16, 49).addBox(-0.5985F, -0.747F, -6.2912F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(1.6F, -0.42F, 5.3857F, 0.372F, 0.2895F, -0.0071F));

		PartDefinition lowerjaw3 = lowerjaw2.addOrReplaceChild("lowerjaw3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1F, -4.3F, -0.1047F, 0.0F, 0.0F));

		PartDefinition lowerjaw6_r3 = lowerjaw3.addOrReplaceChild("lowerjaw6_r3", CubeListBuilder.create().texOffs(71, 24).mirror().addBox(-0.4119F, -0.8755F, -1.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, -0.0772F, 0.1419F, -0.0998F));

		PartDefinition lowerjaw5_r6 = lowerjaw3.addOrReplaceChild("lowerjaw5_r6", CubeListBuilder.create().texOffs(32, 70).mirror().addBox(-0.6482F, -0.0738F, -1.1767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, -0.065F, -0.0096F, -0.013F));

		PartDefinition cube_r159 = lowerjaw3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(15, 76).mirror().addBox(-0.1603F, 0.53F, -0.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, 0.0189F, -0.0752F, 2.9653F));

		PartDefinition cube_r160 = lowerjaw3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(40, 80).mirror().addBox(-0.1308F, 0.205F, -0.601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, -0.2958F, -0.0336F, 2.9488F));

		PartDefinition cube_r161 = lowerjaw3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(5, 76).mirror().addBox(-0.1308F, -0.3005F, -0.5448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, -0.3831F, -0.0336F, 2.9488F));

		PartDefinition cube_r162 = lowerjaw3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(10, 71).mirror().addBox(-0.1308F, 0.1677F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(70, 50).mirror().addBox(-0.1308F, -0.3323F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, -0.2086F, -0.0336F, 2.9488F));

		PartDefinition lowerjaw6_r4 = lowerjaw3.addOrReplaceChild("lowerjaw6_r4", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-0.8149F, 0.3459F, 0.0303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false)
				.texOffs(15, 73).mirror().addBox(-0.8149F, 0.0459F, -0.0697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, 0.1531F, -0.0096F, -0.013F));

		PartDefinition lowerjaw4_r10 = lowerjaw3.addOrReplaceChild("lowerjaw4_r10", CubeListBuilder.create().texOffs(69, 47).mirror().addBox(-0.7952F, 0.0018F, -0.5122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0175F, 0.8728F, 2.7425F, -0.1959F, -0.0096F, -0.013F));

		PartDefinition lowerjaw5_r7 = lowerjaw3.addOrReplaceChild("lowerjaw5_r7", CubeListBuilder.create().texOffs(71, 24).addBox(-0.5881F, -0.8755F, -1.2417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, -0.0772F, -0.1419F, 0.0998F));

		PartDefinition lowerjaw4_r11 = lowerjaw3.addOrReplaceChild("lowerjaw4_r11", CubeListBuilder.create().texOffs(32, 70).addBox(-0.3518F, -0.0738F, -1.1767F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, -0.065F, 0.0096F, 0.013F));

		PartDefinition cube_r163 = lowerjaw3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(15, 76).addBox(-0.8397F, 0.53F, -0.9162F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, 0.0189F, 0.0752F, -2.9653F));

		PartDefinition cube_r164 = lowerjaw3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(40, 80).addBox(-0.8692F, 0.205F, -0.601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, -0.2958F, 0.0336F, -2.9488F));

		PartDefinition cube_r165 = lowerjaw3.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(5, 76).addBox(-0.8692F, -0.3005F, -0.5448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, -0.3831F, 0.0336F, -2.9488F));

		PartDefinition cube_r166 = lowerjaw3.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(10, 71).addBox(-0.8692F, 0.1677F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(70, 50).addBox(-0.8692F, -0.3323F, -0.7073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.247F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, -0.2086F, 0.0336F, -2.9488F));

		PartDefinition lowerjaw5_r8 = lowerjaw3.addOrReplaceChild("lowerjaw5_r8", CubeListBuilder.create().texOffs(0, 72).addBox(-0.1851F, 0.3459F, 0.0303F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F))
				.texOffs(15, 73).addBox(-0.1851F, 0.0459F, -0.0697F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, 0.1531F, 0.0096F, 0.013F));

		PartDefinition lowerjaw3_r9 = lowerjaw3.addOrReplaceChild("lowerjaw3_r9", CubeListBuilder.create().texOffs(69, 47).addBox(-0.2048F, 0.0018F, -0.5122F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.7825F, 0.8728F, 2.7425F, -0.1959F, 0.0096F, 0.013F));

		PartDefinition lowerjawslope = lowerjaw2.addOrReplaceChild("lowerjawslope", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.1F, -3.9F, -0.3643F, 0.0F, 0.0F));

		PartDefinition lowerjawslope_r1 = lowerjawslope.addOrReplaceChild("lowerjawslope_r1", CubeListBuilder.create().texOffs(0, 75).mirror().addBox(-0.5098F, -0.5424F, -0.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(21, 53).mirror().addBox(-0.4902F, -0.5576F, -1.4936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-1.3144F, 0.3489F, 2.7306F, -0.2003F, -0.006F, -0.015F));

		PartDefinition lowerjawslope_r2 = lowerjawslope.addOrReplaceChild("lowerjawslope_r2", CubeListBuilder.create().texOffs(0, 75).addBox(-0.4902F, -0.5424F, -0.3064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(21, 53).addBox(-0.5098F, -0.5576F, -1.4936F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.4856F, 0.3489F, 2.7306F, -0.2003F, 0.006F, 0.015F));

		PartDefinition upperjaw1 = head.addOrReplaceChild("upperjaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.9627F, -5.3899F, 0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw6_r1 = upperjaw1.addOrReplaceChild("upperjaw6_r1", CubeListBuilder.create().texOffs(55, 47).addBox(-2.0F, -1.225F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(1.0F, 2.7336F, -1.4795F, -0.4581F, 0.0F, 0.0F));

		PartDefinition upperjaw6_r2 = upperjaw1.addOrReplaceChild("upperjaw6_r2", CubeListBuilder.create().texOffs(54, 10).addBox(-0.3534F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1466F, 3.5305F, -2.3103F, -0.1004F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r1 = upperjaw1.addOrReplaceChild("upperjaw4_r1", CubeListBuilder.create().texOffs(53, 68).addBox(-1.5F, -0.0607F, -1.0246F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.0F, 1.3F, -1.6F, 0.6632F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r1 = upperjaw1.addOrReplaceChild("upperjaw3_r1", CubeListBuilder.create().texOffs(42, 71).addBox(-1.0F, -0.0059F, -1.0751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.5F, 0.75F, -0.85F, 0.576F, 0.0F, 0.0F));

		PartDefinition upperjaw5_r1 = upperjaw1.addOrReplaceChild("upperjaw5_r1", CubeListBuilder.create().texOffs(59, 4).addBox(-2.5F, 1.9872F, 0.7795F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(1.5F, 1.1F, -4.0F, 0.6196F, 0.0F, 0.0F));

		PartDefinition upperjaw4_r2 = upperjaw1.addOrReplaceChild("upperjaw4_r2", CubeListBuilder.create().texOffs(10, 77).addBox(-1.5F, 0.0234F, -1.0096F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 0.45F, 0.0503F, 0.288F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r2 = upperjaw1.addOrReplaceChild("upperjaw3_r2", CubeListBuilder.create().texOffs(30, 76).addBox(-1.5F, -0.1037F, -0.9093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.0F, 0.514F, 0.9567F, 0.0698F, 0.0F, 0.0F));

		PartDefinition upperjaw2 = upperjaw1.addOrReplaceChild("upperjaw2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, -6.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition upperjaw3_r3 = upperjaw2.addOrReplaceChild("upperjaw3_r3", CubeListBuilder.create().texOffs(60, 35).addBox(-2.0F, -1.15F, 2.275F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.0F, -1.3469F, 1.2003F, -0.1745F, 0.0F, 0.0F));

		PartDefinition nose = upperjaw2.addOrReplaceChild("nose", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, -1.1F, 0.2094F, 0.0F, 0.0F));

		PartDefinition nose_r1 = nose.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(74, 59).addBox(-0.5F, 0.0386F, 0.197F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, -0.525F, 4.6F, 0.2356F, 0.0F, 0.0F));

		PartDefinition nose_r2 = nose.addOrReplaceChild("nose_r2", CubeListBuilder.create().texOffs(5, 73).addBox(-0.5F, 0.0136F, -0.003F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.525F, 4.6F, 0.3054F, 0.0F, 0.0F));

		PartDefinition upperjawteeth = upperjaw2.addOrReplaceChild("upperjawteeth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -1.8F, 0.0785F, 0.0F, 0.0F));

		PartDefinition bone4 = upperjaw1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.9F, 0.1F, -1.0F));

		PartDefinition upperjaw5_r2 = bone4.addOrReplaceChild("upperjaw5_r2", CubeListBuilder.create().texOffs(82, 30).addBox(0.1586F, 0.9873F, -0.5898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0201F, 2.1128F, 1.1831F, 0.341F, 0.1952F, 0.0618F));

		PartDefinition upperjaw4_r3 = bone4.addOrReplaceChild("upperjaw4_r3", CubeListBuilder.create().texOffs(22, 32).addBox(0.1F, -0.75F, -1.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1038F, 3.8862F, -0.3157F, -0.4494F, 0.1571F, 0.0F));

		PartDefinition cube_r167 = bone4.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(74, 21).addBox(-0.4506F, -0.9236F, -0.9739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1352F, 4.0962F, 0.7664F, 0.0472F, 0.01F, -0.1058F));

		PartDefinition cube_r168 = bone4.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(30, 73).addBox(-0.5F, -0.9F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0047F, 5.8289F, 0.761F, 0.363F, 0.0287F, -0.0279F));

		PartDefinition cube_r169 = bone4.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(64, 10).addBox(-0.3611F, -1.7152F, -0.6821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.1352F, 5.3962F, 0.5664F, -0.0122F, 0.0287F, -0.0279F));

		PartDefinition upperjaw5_r3 = bone4.addOrReplaceChild("upperjaw5_r3", CubeListBuilder.create().texOffs(75, 50).addBox(-0.1768F, -0.6214F, -1.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.4562F, 1.496F, 0.8182F, 0.6726F, 0.3312F, 0.0967F));

		PartDefinition upperjaw7_r1 = bone4.addOrReplaceChild("upperjaw7_r1", CubeListBuilder.create().texOffs(51, 33).addBox(-0.6F, -0.075F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F))
				.texOffs(74, 65).addBox(-0.6F, -0.075F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0145F)), PartPose.offsetAndRotation(-0.2103F, 2.7478F, 0.282F, -0.4592F, 0.1241F, -0.0636F));

		PartDefinition upperjaw2_r1 = bone4.addOrReplaceChild("upperjaw2_r1", CubeListBuilder.create().texOffs(37, 29).addBox(-1.6438F, -0.4108F, -1.0365F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0201F, 2.1128F, 1.1831F, 0.3007F, 0.1946F, -0.0231F));

		PartDefinition cube_r170 = bone4.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(64, 0).addBox(-0.3682F, -0.3562F, -0.377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)), PartPose.offsetAndRotation(-0.1352F, 4.0962F, 0.0664F, 0.1449F, 0.0287F, -0.0279F));

		PartDefinition cube_r171 = bone4.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(37, 70).addBox(-0.4506F, -0.7297F, -0.9369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.1352F, 4.0962F, 0.7664F, -0.1273F, 0.01F, -0.1058F));

		PartDefinition upperjaw3_r4 = bone4.addOrReplaceChild("upperjaw3_r4", CubeListBuilder.create().texOffs(9, 44).addBox(-1.2111F, -0.5538F, -0.3858F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4562F, 1.496F, 0.8182F, 0.3473F, 0.1582F, 0.0179F));

		PartDefinition bone6 = upperjaw1.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-0.9F, 0.1F, -1.0F));

		PartDefinition upperjaw6_r3 = bone6.addOrReplaceChild("upperjaw6_r3", CubeListBuilder.create().texOffs(82, 30).mirror().addBox(-0.1586F, 0.9873F, -0.5898F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 2.1128F, 1.1831F, 0.341F, -0.1952F, -0.0618F));

		PartDefinition upperjaw5_r4 = bone6.addOrReplaceChild("upperjaw5_r4", CubeListBuilder.create().texOffs(22, 32).mirror().addBox(-0.1F, -0.75F, -1.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1038F, 3.8862F, -0.3157F, -0.4494F, -0.1571F, 0.0F));

		PartDefinition cube_r172 = bone6.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(74, 21).mirror().addBox(-0.5494F, -0.9236F, -0.9739F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1352F, 4.0962F, 0.7664F, 0.0472F, -0.01F, 0.1058F));

		PartDefinition cube_r173 = bone6.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(30, 73).mirror().addBox(-0.5F, -0.9F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.0047F, 5.8289F, 0.761F, 0.363F, -0.0287F, 0.0279F));

		PartDefinition cube_r174 = bone6.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(64, 10).mirror().addBox(-0.6389F, -1.7152F, -0.6821F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(0.1352F, 5.3962F, 0.5664F, -0.0122F, -0.0287F, 0.0279F));

		PartDefinition upperjaw6_r4 = bone6.addOrReplaceChild("upperjaw6_r4", CubeListBuilder.create().texOffs(75, 50).mirror().addBox(-0.8232F, -0.6214F, -1.0527F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.4562F, 1.496F, 0.8182F, 0.6726F, -0.3312F, -0.0967F));

		PartDefinition upperjaw8_r1 = bone6.addOrReplaceChild("upperjaw8_r1", CubeListBuilder.create().texOffs(51, 33).mirror().addBox(-0.4F, -0.075F, -1.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.014F)).mirror(false)
				.texOffs(74, 65).mirror().addBox(-0.4F, -0.075F, 0.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0145F)).mirror(false), PartPose.offsetAndRotation(0.2103F, 2.7478F, 0.282F, -0.4592F, -0.1241F, 0.0636F));

		PartDefinition upperjaw3_r5 = bone6.addOrReplaceChild("upperjaw3_r5", CubeListBuilder.create().texOffs(37, 29).mirror().addBox(-0.3562F, -0.4108F, -1.0365F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0201F, 2.1128F, 1.1831F, 0.3007F, -0.1946F, 0.0231F));

		PartDefinition cube_r175 = bone6.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(64, 0).mirror().addBox(-0.6318F, -0.3562F, -0.377F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.249F)).mirror(false), PartPose.offsetAndRotation(0.1352F, 4.0962F, 0.0664F, 0.1449F, -0.0287F, 0.0279F));

		PartDefinition cube_r176 = bone6.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(37, 70).mirror().addBox(-0.5494F, -0.7297F, -0.9369F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.1352F, 4.0962F, 0.7664F, -0.1273F, -0.01F, 0.1058F));

		PartDefinition upperjaw4_r4 = bone6.addOrReplaceChild("upperjaw4_r4", CubeListBuilder.create().texOffs(9, 44).mirror().addBox(-0.7889F, -0.5538F, -0.3858F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4562F, 1.496F, 0.8182F, 0.3473F, -0.1582F, -0.0179F));

		PartDefinition bone3 = head.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.5F, 1.0922F, -3.8118F));

		PartDefinition head_r8 = bone3.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(68, 53).addBox(0.3449F, -1.1984F, -0.3154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, -0.4984F, -0.1923F, 0.0855F));

		PartDefinition head_r9 = bone3.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(52, 72).addBox(0.3449F, 0.0791F, 0.1751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, -0.5585F, -0.1178F, 0.0F));

		PartDefinition head_r10 = bone3.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(73, 37).addBox(0.3449F, -0.0716F, -0.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, 0.0175F, -0.1178F, 0.0F));

		PartDefinition head_r11 = bone3.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(34, 48).addBox(-0.4957F, -0.0186F, -1.9899F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9483F, -2.9437F, 1.2825F, 0.2404F, 0.2819F, 0.0471F));

		PartDefinition head_r12 = bone3.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(41, 48).addBox(-0.4516F, -1.5094F, -0.4204F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9483F, -1.3937F, 1.4075F, -0.2328F, 0.4521F, 0.0054F));

		PartDefinition head_r13 = bone3.addOrReplaceChild("head_r13", CubeListBuilder.create().texOffs(0, 49).addBox(-0.5134F, -0.8679F, -1.7543F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9676F, -1.0005F, 1.0265F, 0.0963F, 0.3905F, -0.1496F));

		PartDefinition head_r14 = bone3.addOrReplaceChild("head_r14", CubeListBuilder.create().texOffs(27, 48).addBox(-0.5466F, -0.8489F, -0.2506F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(0.9676F, -1.0005F, 1.0265F, 0.4454F, 0.4857F, -0.2085F));

		PartDefinition head_r15 = bone3.addOrReplaceChild("head_r15", CubeListBuilder.create().texOffs(57, 0).addBox(-0.725F, -0.5F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4411F, -0.9019F, 2.9285F, -0.3074F, 0.5479F, -0.1803F));

		PartDefinition head_r16 = bone3.addOrReplaceChild("head_r16", CubeListBuilder.create().texOffs(5, 69).addBox(0.3299F, -0.235F, -0.7286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, -0.4363F, 0.0262F, 0.0F));

		PartDefinition head_r17 = bone3.addOrReplaceChild("head_r17", CubeListBuilder.create().texOffs(64, 14).addBox(0.3463F, -0.372F, -0.665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, 0.1222F, 0.0262F, 0.0F));

		PartDefinition head_r18 = bone3.addOrReplaceChild("head_r18", CubeListBuilder.create().texOffs(50, 18).addBox(-1.5F, -1.025F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(2.2611F, -2.1885F, 3.1036F, 0.0072F, 0.5717F, 0.0001F));

		PartDefinition head_r19 = bone3.addOrReplaceChild("head_r19", CubeListBuilder.create().texOffs(50, 75).addBox(0.3722F, -0.7175F, -1.3104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6652F, -1.5259F, 4.6236F, -0.1746F, 0.0261F, -0.0023F));

		PartDefinition head_r20 = bone3.addOrReplaceChild("head_r20", CubeListBuilder.create().texOffs(80, 74).addBox(0.3722F, -0.3967F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(1.6652F, -1.5259F, 4.6236F, 1.9198F, 0.0261F, -0.0023F));

		PartDefinition head_r21 = bone3.addOrReplaceChild("head_r21", CubeListBuilder.create().texOffs(27, 70).addBox(0.3722F, -0.1557F, 0.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)), PartPose.offsetAndRotation(1.6652F, -1.5259F, 4.6236F, 1.4835F, 0.0261F, -0.0023F));

		PartDefinition head_r22 = bone3.addOrReplaceChild("head_r22", CubeListBuilder.create().texOffs(45, 75).addBox(0.3722F, -1.4291F, -1.1877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6652F, -1.5259F, 4.6236F, 0.0436F, 0.0261F, -0.0023F));

		PartDefinition head_r23 = bone3.addOrReplaceChild("head_r23", CubeListBuilder.create().texOffs(20, 79).addBox(0.3722F, -0.3212F, -1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.6652F, -1.5259F, 4.6236F, -1.8763F, 0.0261F, -0.0023F));

		PartDefinition head_r24 = bone3.addOrReplaceChild("head_r24", CubeListBuilder.create().texOffs(77, 30).addBox(-0.6701F, -1.5525F, -1.0521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 53).addBox(0.3299F, -1.5525F, -1.0521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, -0.0175F, 0.0262F, 0.0F));

		PartDefinition head_r25 = bone3.addOrReplaceChild("head_r25", CubeListBuilder.create().texOffs(32, 63).addBox(-0.6051F, -1.4755F, -0.1116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, -0.5159F, -0.1923F, 0.0855F));

		PartDefinition head_r26 = bone3.addOrReplaceChild("head_r26", CubeListBuilder.create().texOffs(58, 32).addBox(-0.6701F, -1.4715F, -0.5058F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, -0.3054F, 0.0262F, 0.0F));

		PartDefinition head_r27 = bone3.addOrReplaceChild("head_r27", CubeListBuilder.create().texOffs(39, 23).addBox(-1.0339F, -1.2085F, -2.2398F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6652F, -1.6509F, 4.3986F, 0.3887F, 0.5456F, -0.0551F));

		PartDefinition head_r28 = bone3.addOrReplaceChild("head_r28", CubeListBuilder.create().texOffs(48, 22).addBox(-1.2F, -0.675F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0576F, -2.2327F, 3.2127F, 0.0691F, -0.6079F, -0.2134F));

		PartDefinition head_r29 = bone3.addOrReplaceChild("head_r29", CubeListBuilder.create().texOffs(0, 36).addBox(-1.9695F, -0.306F, -2.0107F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5232F, -2.8937F, 2.6075F, 0.2877F, 0.7119F, 0.0539F));

		PartDefinition head_r30 = bone3.addOrReplaceChild("head_r30", CubeListBuilder.create().texOffs(74, 62).addBox(-0.324F, -0.8095F, -0.4005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(0.9232F, -1.3937F, 1.4075F, -0.2345F, 0.4261F, -0.0759F));

		PartDefinition head_r31 = bone3.addOrReplaceChild("head_r31", CubeListBuilder.create().texOffs(62, 72).addBox(-0.324F, -1.1461F, -0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.9232F, -1.3937F, 1.4075F, -0.3654F, 0.4261F, -0.0759F));

		PartDefinition head_r32 = bone3.addOrReplaceChild("head_r32", CubeListBuilder.create().texOffs(79, 21).addBox(-0.324F, 0.0002F, -0.6963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.9232F, -1.3937F, 1.4075F, -2.5601F, 0.4261F, -0.0759F));

		PartDefinition head_r33 = bone3.addOrReplaceChild("head_r33", CubeListBuilder.create().texOffs(74, 33).addBox(-0.024F, -0.8429F, -0.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(74, 27).addBox(-0.199F, -0.8429F, -0.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.9232F, -1.3937F, 1.4075F, -0.0163F, 0.4261F, -0.0759F));

		PartDefinition head_r34 = bone3.addOrReplaceChild("head_r34", CubeListBuilder.create().texOffs(47, 72).addBox(-0.324F, -0.1998F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(72, 30).addBox(-0.324F, -0.4998F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.9232F, -1.3937F, 1.4075F, -1.5522F, 0.4261F, -0.0759F));

		PartDefinition head_r35 = bone3.addOrReplaceChild("head_r35", CubeListBuilder.create().texOffs(56, 51).addBox(-0.5005F, -1.0903F, -0.8055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2276F, 0.2003F, 0.8159F, -1.1877F, 0.1735F, -0.3069F));

		PartDefinition head_r36 = bone3.addOrReplaceChild("head_r36", CubeListBuilder.create().texOffs(10, 80).addBox(-0.5005F, -0.4441F, -0.2725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.2276F, 0.2003F, 0.8159F, -0.3587F, 0.1735F, -0.3069F));

		PartDefinition head_r37 = bone3.addOrReplaceChild("head_r37", CubeListBuilder.create().texOffs(35, 79).addBox(-0.5005F, -0.5052F, -1.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2276F, 0.2003F, 0.8159F, -0.0532F, 0.1735F, -0.3069F));

		PartDefinition bone5 = head.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.0922F, -3.8118F));

		PartDefinition head_r38 = bone5.addOrReplaceChild("head_r38", CubeListBuilder.create().texOffs(68, 53).mirror().addBox(-1.3449F, -1.1984F, -0.3154F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, -0.4984F, 0.1923F, -0.0855F));

		PartDefinition head_r39 = bone5.addOrReplaceChild("head_r39", CubeListBuilder.create().texOffs(52, 72).mirror().addBox(-1.3449F, 0.0791F, 0.1751F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, -0.5585F, 0.1178F, 0.0F));

		PartDefinition head_r40 = bone5.addOrReplaceChild("head_r40", CubeListBuilder.create().texOffs(73, 37).mirror().addBox(-1.3449F, -0.0716F, -0.349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, 0.0175F, 0.1178F, 0.0F));

		PartDefinition head_r41 = bone5.addOrReplaceChild("head_r41", CubeListBuilder.create().texOffs(34, 48).mirror().addBox(-0.5043F, -0.0186F, -1.9899F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9483F, -2.9437F, 1.2825F, 0.2404F, -0.2819F, -0.0471F));

		PartDefinition head_r42 = bone5.addOrReplaceChild("head_r42", CubeListBuilder.create().texOffs(41, 48).mirror().addBox(-0.5484F, -1.5094F, -0.4204F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9483F, -1.3937F, 1.4075F, -0.2328F, -0.4521F, -0.0054F));

		PartDefinition head_r43 = bone5.addOrReplaceChild("head_r43", CubeListBuilder.create().texOffs(0, 49).mirror().addBox(-0.4867F, -0.8679F, -1.7543F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9676F, -1.0005F, 1.0265F, 0.0963F, -0.3905F, 0.1496F));

		PartDefinition head_r44 = bone5.addOrReplaceChild("head_r44", CubeListBuilder.create().texOffs(27, 48).mirror().addBox(-0.4534F, -0.8489F, -0.2506F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(-0.9676F, -1.0005F, 1.0265F, 0.4454F, -0.4857F, 0.2085F));

		PartDefinition head_r45 = bone5.addOrReplaceChild("head_r45", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.275F, -0.5F, -1.425F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4411F, -0.9019F, 2.9285F, -0.3074F, -0.5479F, 0.1803F));

		PartDefinition head_r46 = bone5.addOrReplaceChild("head_r46", CubeListBuilder.create().texOffs(5, 69).mirror().addBox(-1.3299F, -0.235F, -0.7286F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, -0.4363F, -0.0262F, 0.0F));

		PartDefinition head_r47 = bone5.addOrReplaceChild("head_r47", CubeListBuilder.create().texOffs(64, 14).mirror().addBox(-1.3463F, -0.372F, -0.665F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, 0.1222F, -0.0262F, 0.0F));

		PartDefinition head_r48 = bone5.addOrReplaceChild("head_r48", CubeListBuilder.create().texOffs(50, 18).mirror().addBox(-0.5F, -1.025F, -0.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-2.2611F, -2.1885F, 3.1036F, 0.0072F, -0.5717F, -0.0001F));

		PartDefinition head_r49 = bone5.addOrReplaceChild("head_r49", CubeListBuilder.create().texOffs(50, 75).mirror().addBox(-1.3722F, -0.7175F, -1.3104F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.5259F, 4.6236F, -0.1746F, -0.0261F, 0.0023F));

		PartDefinition head_r50 = bone5.addOrReplaceChild("head_r50", CubeListBuilder.create().texOffs(80, 74).mirror().addBox(-1.3722F, -0.3967F, -0.0757F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.5259F, 4.6236F, 1.9198F, -0.0261F, 0.0023F));

		PartDefinition head_r51 = bone5.addOrReplaceChild("head_r51", CubeListBuilder.create().texOffs(27, 70).mirror().addBox(-1.3722F, -0.1557F, 0.1704F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.009F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.5259F, 4.6236F, 1.4835F, -0.0261F, 0.0023F));

		PartDefinition head_r52 = bone5.addOrReplaceChild("head_r52", CubeListBuilder.create().texOffs(45, 75).mirror().addBox(-1.3722F, -1.4291F, -1.1877F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.5259F, 4.6236F, 0.0436F, -0.0261F, 0.0023F));

		PartDefinition head_r53 = bone5.addOrReplaceChild("head_r53", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-1.3722F, -0.3212F, -1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.5259F, 4.6236F, -1.8763F, -0.0261F, 0.0023F));

		PartDefinition head_r54 = bone5.addOrReplaceChild("head_r54", CubeListBuilder.create().texOffs(77, 30).mirror().addBox(-0.3299F, -1.5525F, -1.0521F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(63, 53).mirror().addBox(-1.3299F, -1.5525F, -1.0521F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, -0.0175F, -0.0262F, 0.0F));

		PartDefinition head_r55 = bone5.addOrReplaceChild("head_r55", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(-1.3949F, -1.4755F, -0.1116F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, -0.5159F, 0.1923F, -0.0855F));

		PartDefinition head_r56 = bone5.addOrReplaceChild("head_r56", CubeListBuilder.create().texOffs(58, 32).mirror().addBox(-1.3299F, -1.4715F, -0.5058F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, -0.3054F, -0.0262F, 0.0F));

		PartDefinition head_r57 = bone5.addOrReplaceChild("head_r57", CubeListBuilder.create().texOffs(39, 23).mirror().addBox(0.0339F, -1.2085F, -2.2398F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6652F, -1.6509F, 4.3986F, 0.3887F, -0.5456F, 0.0551F));

		PartDefinition head_r58 = bone5.addOrReplaceChild("head_r58", CubeListBuilder.create().texOffs(48, 22).mirror().addBox(-1.8F, -0.675F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0576F, -2.2327F, 3.2127F, 0.0691F, 0.6079F, 0.2134F));

		PartDefinition head_r59 = bone5.addOrReplaceChild("head_r59", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-0.0305F, -0.306F, -2.0107F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5232F, -2.8937F, 2.6075F, 0.2877F, -0.7119F, -0.0539F));

		PartDefinition head_r60 = bone5.addOrReplaceChild("head_r60", CubeListBuilder.create().texOffs(74, 62).mirror().addBox(-0.676F, -0.8095F, -0.4005F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9232F, -1.3937F, 1.4075F, -0.2345F, -0.4261F, 0.0759F));

		PartDefinition head_r61 = bone5.addOrReplaceChild("head_r61", CubeListBuilder.create().texOffs(62, 72).mirror().addBox(-0.676F, -1.1461F, -0.4293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.9232F, -1.3937F, 1.4075F, -0.3654F, -0.4261F, 0.0759F));

		PartDefinition head_r62 = bone5.addOrReplaceChild("head_r62", CubeListBuilder.create().texOffs(79, 21).mirror().addBox(-0.676F, 0.0002F, -0.6963F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.9232F, -1.3937F, 1.4075F, -2.5601F, -0.4261F, 0.0759F));

		PartDefinition head_r63 = bone5.addOrReplaceChild("head_r63", CubeListBuilder.create().texOffs(74, 33).mirror().addBox(-0.976F, -0.8429F, -0.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(74, 27).mirror().addBox(-0.801F, -0.8429F, -0.5064F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.9232F, -1.3937F, 1.4075F, -0.0163F, -0.4261F, 0.0759F));

		PartDefinition head_r64 = bone5.addOrReplaceChild("head_r64", CubeListBuilder.create().texOffs(47, 72).mirror().addBox(-0.676F, -0.1998F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 30).mirror().addBox(-0.676F, -0.4998F, -0.6845F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.9232F, -1.3937F, 1.4075F, -1.5522F, -0.4261F, 0.0759F));

		PartDefinition head_r65 = bone5.addOrReplaceChild("head_r65", CubeListBuilder.create().texOffs(56, 51).mirror().addBox(-0.4995F, -1.0903F, -0.8055F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2276F, 0.2003F, 0.8159F, -1.1877F, -0.1735F, 0.3069F));

		PartDefinition head_r66 = bone5.addOrReplaceChild("head_r66", CubeListBuilder.create().texOffs(10, 80).mirror().addBox(-0.4995F, -0.4441F, -0.2725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-0.2276F, 0.2003F, 0.8159F, -0.3587F, -0.1735F, 0.3069F));

		PartDefinition head_r67 = bone5.addOrReplaceChild("head_r67", CubeListBuilder.create().texOffs(35, 79).mirror().addBox(-0.4995F, -0.5052F, -1.1125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2276F, 0.2003F, 0.8159F, -0.0532F, -0.1735F, 0.3069F));

		PartDefinition fur1 = body.addOrReplaceChild("fur1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0687F, -18.2658F, 0.4098F, 0.0F, 0.0F));

		PartDefinition fur2 = fur1.addOrReplaceChild("fur2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, -1.5F, 0.182F, 0.0F, 0.0F));

		PartDefinition fur3 = fur2.addOrReplaceChild("fur3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9F, -1.9F, 0.182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 85, 85);
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