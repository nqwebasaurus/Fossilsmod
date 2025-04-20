package fossils.fossils.client.blockentity.model.tanystropheus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class TanystropheusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart neckbase;
	private final ModelPart frontLeftLeg;
	private final ModelPart frontLeftLeg2;
	private final ModelPart frontLeftLeg3;
	private final ModelPart frontLeftLeg4;
	private final ModelPart frontRightLeg;
	private final ModelPart frontRightLeg2;
	private final ModelPart frontRightLeg3;
	private final ModelPart frontRightLeg4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart neck7;
	private final ModelPart neck8;
	private final ModelPart neck9;
	private final ModelPart neck10;
	private final ModelPart head;
	private final ModelPart lowerjaw;
	private final ModelPart upperjaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart body3;
	private final ModelPart backLeftLeg;
	private final ModelPart backLeftLeg2;
	private final ModelPart backLeftLeg3;
	private final ModelPart backLeftLeg4;
	private final ModelPart backLeftLeg5;
	private final ModelPart backRightLeg;
	private final ModelPart backRightLeg2;
	private final ModelPart backRightLeg3;
	private final ModelPart backRightLeg4;
	private final ModelPart backRightLeg5;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;

	public TanystropheusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body2 = this.fossil.getChild("body2");
		this.body = this.body2.getChild("body");
		this.neckbase = this.body.getChild("neckbase");
		this.frontLeftLeg = this.neckbase.getChild("frontLeftLeg");
		this.frontLeftLeg2 = this.frontLeftLeg.getChild("frontLeftLeg2");
		this.frontLeftLeg3 = this.frontLeftLeg2.getChild("frontLeftLeg3");
		this.frontLeftLeg4 = this.frontLeftLeg3.getChild("frontLeftLeg4");
		this.frontRightLeg = this.neckbase.getChild("frontRightLeg");
		this.frontRightLeg2 = this.frontRightLeg.getChild("frontRightLeg2");
		this.frontRightLeg3 = this.frontRightLeg2.getChild("frontRightLeg3");
		this.frontRightLeg4 = this.frontRightLeg3.getChild("frontRightLeg4");
		this.neck = this.neckbase.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.neck7 = this.neck6.getChild("neck7");
		this.neck8 = this.neck7.getChild("neck8");
		this.neck9 = this.neck8.getChild("neck9");
		this.neck10 = this.neck9.getChild("neck10");
		this.head = this.neck10.getChild("head");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.upperjaw = this.head.getChild("upperjaw");
		this.leftFace = this.upperjaw.getChild("leftFace");
		this.rightFace = this.upperjaw.getChild("rightFace");
		this.body3 = this.body2.getChild("body3");
		this.backLeftLeg = this.body3.getChild("backLeftLeg");
		this.backLeftLeg2 = this.backLeftLeg.getChild("backLeftLeg2");
		this.backLeftLeg3 = this.backLeftLeg2.getChild("backLeftLeg3");
		this.backLeftLeg4 = this.backLeftLeg3.getChild("backLeftLeg4");
		this.backLeftLeg5 = this.backLeftLeg4.getChild("backLeftLeg5");
		this.backRightLeg = this.body3.getChild("backRightLeg");
		this.backRightLeg2 = this.backRightLeg.getChild("backRightLeg2");
		this.backRightLeg3 = this.backRightLeg2.getChild("backRightLeg3");
		this.backRightLeg4 = this.backRightLeg3.getChild("backRightLeg4");
		this.backRightLeg5 = this.backRightLeg4.getChild("backRightLeg5");
		this.tail = this.body3.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(0.8F, -3.75F, -0.5F, 1.0F, 19.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -15.25F, -14.8F, 0.0F, -0.3142F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-2.15F, -4.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -15.25F, -14.8F, 0.3142F, 0.0F, -1.5708F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(1.75F, -4.5F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -18.75F, 14.0F, -0.0436F, 0.0F, -1.5708F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 1).addBox(-0.9F, -3.25F, -0.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.5F, -18.75F, 14.0F, 0.0F, 0.0436F, 0.0F));

		PartDefinition body2 = fossil.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -19.8F, 3.1F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 101).addBox(-0.5F, -0.1F, -0.4F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.0F, 3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 72).addBox(-0.5F, 0.4F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -3.0F, -8.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7F, -7.5F, -0.0004F, -0.1308F, 0.0057F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(95, 39).addBox(-0.5F, 0.131F, 0.3268F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.05F, -8.3F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neckbase = body.addOrReplaceChild("neckbase", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.15F, -7.7F, 0.0691F, -0.1744F, 0.0077F));

		PartDefinition cube_r8 = neckbase.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(68, 40).addBox(-0.5F, 0.5F, -3.9F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 1.3F, -6.8F, 0.2618F, 0.0F, 0.0F));

		PartDefinition frontLeftLeg = neckbase.addOrReplaceChild("frontLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4507F, 6.8422F, -2.678F, 0.9414F, -0.0153F, -0.541F));

		PartDefinition frontLeftLeg2 = frontLeftLeg.addOrReplaceChild("frontLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.115F, 9.2371F, -1.1785F, -0.6736F, 0.2289F, 0.4007F));

		PartDefinition frontLeftLeg3 = frontLeftLeg2.addOrReplaceChild("frontLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2697F, 7.1544F, -0.0233F, 0.5503F, -0.3883F, 0.2493F));

		PartDefinition frontLeftLeg4 = frontLeftLeg3.addOrReplaceChild("frontLeftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 0.1F, -1.3F, -0.6545F, 0.0F, 0.0F));

		PartDefinition frontRightLeg = neckbase.addOrReplaceChild("frontRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.4507F, 6.8422F, -2.678F, 0.1466F, -0.1608F, 0.6704F));

		PartDefinition frontRightLeg2 = frontRightLeg.addOrReplaceChild("frontRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.115F, 9.2371F, -1.1785F, -0.8918F, -0.2289F, -0.4007F));

		PartDefinition frontRightLeg3 = frontRightLeg2.addOrReplaceChild("frontRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2697F, 7.1544F, -0.0233F, 0.524F, 0.2539F, -0.0563F));

		PartDefinition frontRightLeg4 = frontRightLeg3.addOrReplaceChild("frontRightLeg4", CubeListBuilder.create(), PartPose.offset(4.5F, 0.1F, -1.3F));

		PartDefinition neck = neckbase.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(34, 109).addBox(-0.5F, -0.2F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 2.9792F, -9.902F, 0.0435F, -0.436F, -0.0184F));

		PartDefinition cube_r9 = neck.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(86, 98).addBox(-0.5F, -1.0F, -6.9F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.8F, -5.1F, -0.0698F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(41, 0).addBox(-0.5F, -0.3F, -13.9F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -0.4201F, -11.699F, -0.1454F, -0.389F, 0.0555F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(35, 40).addBox(-0.5F, -0.3F, -13.4F, 1.0F, 2.0F, 14.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -0.0378F, -13.9646F, -0.124F, -0.3466F, 0.0423F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1302F, -13.6535F, -0.0757F, -0.2176F, 0.0164F));

		PartDefinition cube_r10 = neck4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(66, 57).addBox(-0.5F, 0.7F, -0.3F, 1.0F, 2.0F, 12.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -1.4062F, -10.8945F, -0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2062F, -10.7945F, 0.0915F, -0.3042F, -0.0275F));

		PartDefinition cube_r11 = neck5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(79, 86).addBox(-0.5F, -0.7F, -0.2F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -2.3389F, -8.4929F, -0.2967F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8F, -8.5F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition cube_r12 = neck6.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 88).addBox(-0.5F, 0.725F, -0.25F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -5.2225F, -6.3764F, -0.5585F, 0.0F, 0.0F));

		PartDefinition neck7 = neck6.addOrReplaceChild("neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.4F, -7.4F, 0.1355F, -0.2595F, -0.035F));

		PartDefinition cube_r13 = neck7.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 76).addBox(-0.5F, 0.5F, -0.175F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -5.8346F, -7.2615F, -0.5672F, 0.0F, 0.0F));

		PartDefinition neck8 = neck7.addOrReplaceChild("neck8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.8F, -7.5F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r14 = neck8.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 89).addBox(-0.5F, 0.7704F, -0.1799F, 1.0F, 2.0F, 9.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -4.1708F, -7.7288F, -0.3447F, 0.0F, 0.0F));

		PartDefinition neck9 = neck8.addOrReplaceChild("neck9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.1F, -8.2F, -0.1855F, -0.3435F, 0.0631F));

		PartDefinition cube_r15 = neck9.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(95, 50).addBox(-0.5F, 0.6972F, -0.1107F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, -0.6371F, -7.2058F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck10 = neck9.addOrReplaceChild("neck10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -7.2F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r16 = neck10.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(114, 61).addBox(-0.5F, 0.2019F, -2.8F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.207F)), PartPose.offsetAndRotation(0.0F, 0.0F, -0.8F, 0.2182F, 0.0F, 0.0F));

		PartDefinition head = neck10.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.581F, -2.1427F, 0.3529F, 0.0F, 0.0F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.9F, -0.6F, 0.5672F, 0.0F, 0.0F));

		PartDefinition upperjaw = head.addOrReplaceChild("upperjaw", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition leftFace = upperjaw.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.5212F, -0.8079F, -5.5428F));

		PartDefinition rightFace = upperjaw.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.5212F, -0.8079F, -5.5428F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.7263F, 9.6045F, 0.0694F, 0.1308F, -0.0057F));

		PartDefinition cube_r17 = body3.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(93, 72).addBox(-0.5F, 1.5F, -7.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, 0.5F, 6.9F, -0.2618F, 0.0F, 0.0F));

		PartDefinition backLeftLeg = body3.addOrReplaceChild("backLeftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.4792F, 2.2409F, 0.9468F, -0.2885F, -0.1956F, -0.321F));

		PartDefinition backLeftLeg2 = backLeftLeg.addOrReplaceChild("backLeftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0166F, 13.4311F, 3.8331F, 1.5973F, -0.26F, 0.1973F));

		PartDefinition backLeftLeg3 = backLeftLeg2.addOrReplaceChild("backLeftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0514F, 8.8798F, 0.7468F, 0.1507F, 0.0871F, 0.0055F));

		PartDefinition backLeftLeg4 = backLeftLeg3.addOrReplaceChild("backLeftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0007F, 0.4836F, -3.7202F, -0.6545F, 0.0F, 0.0F));

		PartDefinition backLeftLeg5 = backLeftLeg4.addOrReplaceChild("backLeftLeg5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0005F, -2.9856F, -0.829F, 0.0F, 0.0F));

		PartDefinition backRightLeg = body3.addOrReplaceChild("backRightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4792F, 2.2409F, 0.9468F, -1.0303F, 0.1956F, 0.321F));

		PartDefinition backRightLeg2 = backRightLeg.addOrReplaceChild("backRightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0166F, 13.4311F, 3.8331F, 1.2046F, 0.26F, -0.1973F));

		PartDefinition backRightLeg3 = backRightLeg2.addOrReplaceChild("backRightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0514F, 8.8798F, 0.7468F, 0.1504F, 0.0026F, -0.0173F));

		PartDefinition backRightLeg4 = backRightLeg3.addOrReplaceChild("backRightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0007F, 0.4836F, -3.7202F, -0.4276F, 0.0F, 0.0F));

		PartDefinition backRightLeg5 = backRightLeg4.addOrReplaceChild("backRightLeg5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0005F, -2.9856F));

		PartDefinition tail = body3.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.1306F, 7.6266F, -0.3452F, 0.2057F, -0.0733F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(57, 86).addBox(-0.5F, 0.5F, 0.8F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.3109F, -1.0747F, -0.0873F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9942F, 8.6901F, -0.2022F, 0.2139F, -0.0435F));

		PartDefinition cube_r19 = tail2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(75, 0).addBox(-0.5F, 0.3F, 0.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.0F, -0.2206F, -0.0782F, 0.0873F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, -0.3769F, -0.4033F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.15F))
				.texOffs(17, 37).addBox(-0.5F, -0.3769F, 16.2967F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6901F, 11.0216F, 0.0219F, 0.1309F, 0.0029F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(40, 21).addBox(-0.5F, 0.3618F, 0.0697F, 1.0F, 1.0F, 17.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7057F, 16.6901F, 0.1312F, -0.2596F, -0.0339F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.4672F, -0.3141F, 1.0F, 1.0F, 19.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.072F, 16.9386F, 0.2291F, -0.5553F, -0.1223F));

		return LayerDefinition.create(meshdefinition, 150, 150);
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